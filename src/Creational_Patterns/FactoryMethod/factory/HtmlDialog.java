package Creational_Patterns.FactoryMethod.factory;

import Creational_Patterns.FactoryMethod.buttons.Button;
import Creational_Patterns.FactoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
