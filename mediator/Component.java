package mediator;

abstract class Component {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed(String event) {
        mediator.notify(this, event);
    }
}