package Creational_Patterns.AbstractFactory.factories;

import Creational_Patterns.AbstractFactory.buttons.Button;
import Creational_Patterns.AbstractFactory.buttons.MacButton;
import Creational_Patterns.AbstractFactory.checkboxes.Checkbox;
import Creational_Patterns.AbstractFactory.checkboxes.MacCheckbox;

public class MacFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
