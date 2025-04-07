package staticDemo;

public class Car extends DriverCar {
    private String color;
    private static int counter;
    private final String brandName;
    public final static boolean FOUR_WHEEL_DRIVE;// = true;//V1
    //V2 - static initializer
    static {
        System.out.println("Calling static initializer...");
        FOUR_WHEEL_DRIVE = true;
    }

    public String getColor() {
        return color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setColor(String color) {
        if (!color.isEmpty()) {
            this.color = color;
        } else {
            System.out.println("Error: invalid color!");
        }
    }
    public static int getCounter() {
        return counter;
    }

    public Car(String color, String brandName){
        System.out.println("Calling the constructor...");
        setColor(color);
        this.brandName = brandName;
        counter++;
    }

    @Override
    public void driveForward() {
        System.out.println("Moving forward...");
    }

    @Override
    public void driveBackward() {
        System.out.println("Moving backward...");
    }
    // We cannot override final method
//    public void nonAbstractMethod(){
//        System.out.println("You call a non abstract method...");
//    }
}
