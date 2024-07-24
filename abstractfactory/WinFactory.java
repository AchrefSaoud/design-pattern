package abstractfactory;

public class WinFactory implements GuiFactory{

    public Button createButton() {
        return new WinButton();
    }

    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
    
}
