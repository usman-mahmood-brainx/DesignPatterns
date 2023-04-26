// Product
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private int numDoors;

    public Car(String make, String model, int year, String color, int numDoors) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.numDoors = numDoors;
    }

    // getters and setters...
}

// Builder
public interface CarBuilder {
    CarBuilder setMake(String make);
    CarBuilder setModel(String model);
    CarBuilder setYear(int year);
    CarBuilder setColor(String color);
    CarBuilder setNumDoors(int numDoors);
    Car build();
}

// Concrete Builder
public class SedanBuilder implements CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;
    private int numDoors;

    public SedanBuilder() {
        // default values
        this.make = "Toyota";
        this.model = "Camry";
        this.year = 2021;
        this.color = "black";
        this.numDoors = 4;
    }

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setNumDoors(int numDoors) {
        this.numDoors = numDoors;
        return this;
    }

    public Car build() {
        return new Car(make, model, year, color, numDoors);
    }
}

// Director
public class CarFactory {
    public Car buildSedan(CarBuilder builder) {
        return builder.setMake("Toyota")
                      .setModel("Camry")
                      .setYear(2021)
                      .setColor("black")
                      .setNumDoors(4)
                      .build();
    }
}
class Main(){
	public static void main(String args[]){
		CarBuilder builder = new SedanBuilder();
		CarFactory factory = new CarFactory();
		Car sedan = factory.buildSedan(builder);

	}
}

