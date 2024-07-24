package mediator;

class Button extends Component {
    public Button(Mediator mediator) {
        super(mediator);
    }

    public void click() {
        changed("submit");
    }
}