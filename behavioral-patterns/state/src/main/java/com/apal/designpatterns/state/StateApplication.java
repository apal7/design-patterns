package com.apal.designpatterns.state;


import com.apal.designpatterns.state.ui.Player;
import com.apal.designpatterns.state.ui.UI;

public class StateApplication {

	public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }

}

