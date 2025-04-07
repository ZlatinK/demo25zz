package staticDemo;

public class Tesla extends Car{
    private int batteryCapacity;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        if(batteryCapacity >= 50){
            this.batteryCapacity = batteryCapacity;
        } else {
            System.out.println("Error: invalid batteryCapacity!");
        }
    }

    public Tesla(String color, String brandName, int batteryCapacity) {
        super(color, brandName);
        setBatteryCapacity(batteryCapacity);
    }
}
