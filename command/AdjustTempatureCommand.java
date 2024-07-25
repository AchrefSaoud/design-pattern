package command;

public class AdjustTempatureCommand implements Command {
    private AirConditioner airConditioner;

    public AdjustTempatureCommand(AirConditioner airConditioner) {
        this.airConditioner=airConditioner;
    }

    @Override
    public void execute() {
        this.airConditioner.adjustTempature();
    }

}
