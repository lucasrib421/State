/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padraostate;

import com.mycompany.state.ui.Player;
import com.mycompany.state.ui.UI;

/**
 *
 * @author lucas
 */
public class PadraoState {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
