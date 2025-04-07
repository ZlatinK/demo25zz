package staticDemo;

public abstract class DriverCar {
    public abstract void driveForward();
    public abstract void driveBackward();

    public final void nonAbstractMethod() {
        System.out.println("I am not abstract");
    }
}
