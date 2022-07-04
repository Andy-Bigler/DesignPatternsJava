package Creational_Patterns.AbstractFactory.factories;

import Creational_Patterns.AbstractFactory.buttons.Button;
import Creational_Patterns.AbstractFactory.buttons.WindowsButton;
import Creational_Patterns.AbstractFactory.checkboxes.Checkbox;
import Creational_Patterns.AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
