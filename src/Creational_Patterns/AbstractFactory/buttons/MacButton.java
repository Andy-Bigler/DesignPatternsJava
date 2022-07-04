package Creational_Patterns.AbstractFactory.buttons;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
