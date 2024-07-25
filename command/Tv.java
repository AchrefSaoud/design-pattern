package command;

public class Tv implements Device{

    @Override
    public void turnOn() {
        System.out.println("Turn the tv on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn the tv of...");
    }
    
    public void changeChannel() {
        System.out.println("Channel changed");
    }
}
