package Creational_Patterns.FactoryMethod.buttons;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("Windows Button");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Windows Button says - 'Hello World!'");
    }
}
