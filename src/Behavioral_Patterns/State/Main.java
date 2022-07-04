package Behavioral_Patterns.State;

import Behavioral_Patterns.State.ui.Player;
import Behavioral_Patterns.State.ui.UI;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
