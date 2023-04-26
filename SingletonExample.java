public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    
    private DatabaseConnection() {
        // private constructor to prevent instantiation from outside the class
    }
    
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            // create a new database connection if one does not exist
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "user", "password");
        }
        return connection;
    }
}


class Main(){
	public static void main(String args[]){

		try {
		    Connection connection = DatabaseConnection.getInstance().getConnection();
		    // use the database connection
		} catch (SQLException e) {
		    e.printStackTrace();
		}

	}
}

