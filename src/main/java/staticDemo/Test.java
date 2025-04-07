package staticDemo;

public class Test {
    public static void main(String[] args) {
        System.out.println("Cars before creating one: " + Car.getCounter());

        Car audi = new Car("Red", "Audi");

        System.out.println("Cars after creating one: " + Car.getCounter());
        System.out.println("Cars after creating one: " + audi.getCounter());

        Car bmw = new Car("Black", "BMW");

        System.out.println("Cars after creating one: " + Car.getCounter());
        System.out.println("Cars after creating one: " + bmw.getCounter());

        //we cannot have an object from an abstract class
        //DriverCar something = new DriverCar();

    }
}
