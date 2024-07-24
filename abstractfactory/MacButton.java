package abstractfactory;

public class MacButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in macOS style.");
    }
}