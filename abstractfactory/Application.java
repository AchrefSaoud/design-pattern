package abstractfactory;

class Application {
    private GuiFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.checkbox=factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

