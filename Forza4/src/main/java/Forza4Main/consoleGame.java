package Forza4Main;

import java.io.IOException;

import Exception.Forza4Exception;
import Game.Menu;


/**
 * <b>Responsabilità:</b> Console che avvia il sistema.
 */

public class consoleGame {

	/**
	 * Metodo per avviare il sistema
	 * @param args
	 * @throws IOException 
	 * @throws Forza4Exception 
	 *  
	 */
	public static void main(String[] args) throws IOException, Forza4Exception{
			
		Menu.menu();
		
	}
}
