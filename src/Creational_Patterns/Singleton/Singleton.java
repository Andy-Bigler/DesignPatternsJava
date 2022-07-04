package Creational_Patterns.Singleton;

public class Singleton {
    public static Singleton instance = null;

    public String text;

    private Singleton() {
        text = "Hello World";
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
