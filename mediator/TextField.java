package mediator;

class TextField extends Component {
    private String text;
    private boolean visible;

    public TextField(Mediator mediator) {
        super(mediator);
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
        System.out.println("TextField visibility: " + visible);
    }
}
