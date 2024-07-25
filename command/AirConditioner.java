package command;

public class AirConditioner implements Device {

    @Override
    public void turnOn() {
        System.out.println("Turn the air conditioner on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn the air conditioner of...");
    }
    public void adjustTempature() {
        System.out.println("adjust the temperature of the air conditioner");
    }
}
