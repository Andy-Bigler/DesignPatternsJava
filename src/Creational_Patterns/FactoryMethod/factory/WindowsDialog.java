package Creational_Patterns.FactoryMethod.factory;

import Creational_Patterns.FactoryMethod.buttons.Button;
import Creational_Patterns.FactoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
