package abstractfactory;

public class MacCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in macOS style.");
    }
}