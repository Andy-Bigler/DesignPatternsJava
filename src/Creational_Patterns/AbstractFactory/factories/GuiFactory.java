package Creational_Patterns.AbstractFactory.factories;

import Creational_Patterns.AbstractFactory.buttons.Button;
import Creational_Patterns.AbstractFactory.checkboxes.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
