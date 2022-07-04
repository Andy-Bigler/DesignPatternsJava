package Creational_Patterns.AbstractFactory;

import Creational_Patterns.AbstractFactory.buttons.Button;
import Creational_Patterns.AbstractFactory.checkboxes.Checkbox;
import Creational_Patterns.AbstractFactory.factories.GuiFactory;

public class App {
    private final Button button;
    private final Checkbox checkbox;

    public App(GuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
