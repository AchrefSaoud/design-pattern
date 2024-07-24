package abstractfactory;


public class Test {
    public static void main(String[] args) {
        String configOS = readApplicationConfigFile();

        GuiFactory factory;
        if ("Windows".equals(configOS)) {
            factory = new WinFactory();
        } else if ("Mac".equals(configOS)) {
            factory = new MacFactory();
        } else {
            throw new RuntimeException("Error! Unknown operating system.");
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }

    private static String readApplicationConfigFile() {
        return "Windows"; 
    }
}
