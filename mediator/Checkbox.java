package mediator;

class Checkbox extends Component {
    private boolean checked;

    public Checkbox(Mediator mediator) {
        super(mediator);
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        changed("check");
    }

    public boolean isChecked() {
        return checked;
    }
}