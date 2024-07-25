package command;

public class ChangeChannelCommand implements Command {
    private Tv tv;

    public ChangeChannelCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.changeChannel();
    }

}
