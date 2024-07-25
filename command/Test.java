package command;

public class Test {
    public static void main(String[] args) {
        Tv tv = new Tv();
        AirConditioner airConditioner=new AirConditioner();
 
        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOfCommand(tv);
        Command adjustTempatureCommand = new AdjustTempatureCommand(airConditioner);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);
 
        // Create remote control
        RemoteControl remote = new RemoteControl();
 
        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton();  
        remote.setCommand(adjustTempatureCommand);
        remote.pressButton(); 
        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); 
        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); 
    }
}
