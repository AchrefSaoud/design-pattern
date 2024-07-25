package command;


public class TurnOfCommand implements Command{
    private Device device;

    public TurnOfCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.turnOff();
    }  
}
