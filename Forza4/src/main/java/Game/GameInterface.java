package Game;

import java.io.IOException;

import Controller.Controller;
import Controller.gestioneInput;

import Model.Model;
import Player.Player;
import View.ViewInterface;

/**
 * <b>Responsabilità:</b> Definisce il funzionamento di un game 
 */
public interface GameInterface {

	/**
	 * Metodo principale di esecuzione del gioco tramite tutte le varie componenti
	 * @param Player uno
	 * @param Player due
	 * @param model
	 * @param controller
	 * @param view
	 * @param io
	 * @return un risultato di gioco : win or tie
	 * @throws IOException
	 */
	GameResult start(Player uno , Player due , Model model ,Controller controller , ViewInterface view , gestioneInput io) throws IOException;

}
