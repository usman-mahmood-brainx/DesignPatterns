public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation from outside the class
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}



class Main(){
	public static void main(String args[]){

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton1 == singleton2); // Output: true

	}
}
