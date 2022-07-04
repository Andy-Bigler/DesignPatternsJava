package Behavioral_Patterns.Observer;

import Behavioral_Patterns.Observer.editor.Editor;
import Behavioral_Patterns.Observer.listeners.EmailNotificationListener;
import Behavioral_Patterns.Observer.listeners.LogOpenListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("./test.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("./test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
