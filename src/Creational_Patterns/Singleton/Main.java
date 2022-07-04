package Creational_Patterns.Singleton;

public class Main {
    public static void main(String[] args) {
        var a = Singleton.getInstance();
        var b = Singleton.getInstance();

        System.out.println(a.text);
        System.out.println(b.text);
    }
}
