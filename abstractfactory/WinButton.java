package abstractfactory;

public class WinButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}