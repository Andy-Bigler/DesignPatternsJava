package Creational_Patterns.AbstractFactory.checkboxes;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
