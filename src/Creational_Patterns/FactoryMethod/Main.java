package Creational_Patterns.FactoryMethod;

import Creational_Patterns.FactoryMethod.factory.Dialog;
import Creational_Patterns.FactoryMethod.factory.HtmlDialog;
import Creational_Patterns.FactoryMethod.factory.WindowsDialog;

public class Main {
    private static Dialog dialog;


    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
