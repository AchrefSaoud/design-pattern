package abstractfactory;

public class MacFactory implements GuiFactory {

    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
    
}
