package Creational_Patterns.FactoryMethod.factory;

import Creational_Patterns.FactoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
