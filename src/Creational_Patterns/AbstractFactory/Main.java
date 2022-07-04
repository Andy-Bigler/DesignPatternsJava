package Creational_Patterns.AbstractFactory;

import Creational_Patterns.AbstractFactory.factories.GuiFactory;
import Creational_Patterns.AbstractFactory.factories.MacFactory;
import Creational_Patterns.AbstractFactory.factories.WindowsFactory;

public class Main {
    private static App configureApplication() {
        App app;
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new App(factory);
        return app;
    }

    public static void main(String[] args) {
        App app = configureApplication();
        app.paint();
    }
}
