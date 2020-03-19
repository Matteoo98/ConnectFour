package Game;

import java.io.IOException;

import Controller.Controller;
import Controller.gestioneInput;
import Model.Model;
import Player.Player;
import View.ViewInterface;

/**
 * <b>Responsabilità:</b> Coordina lo svolgimento di un match. 
 */
public class Game implements GameInterface {

	/**
	 * Turno del giocatore tramite un numero
	 */
	private int turn;

	/**
	 * Costruttore di un game
	 * @param view
	 */
	public Game(ViewInterface view) {
	}

	/**
	 * Metodo per cambiare il turno dal giocatore corrente a quello opponente
	 * @return turn+1
	 */
	private int opponent() {
		return turn++;
	}

	/**
	 * Metodo che ritorna il turno corrente
	 * @return turno corrente
	 */
	private int current() {
		return turn;
	}

	
	@Override
	public GameResult start(Player uno, Player due, Model model, Controller controller, ViewInterface view,
			gestioneInput io) throws IOException {
	
				
		while (controller.boardIsFull(model) == false) {

			view.showBoard(model);

			controller.takeColumn(model, io.askColumn(currentPlayer(uno, due)), currentPlayer(uno, due));
			
			if (controller.checkWinner(model, (currentPlayer(uno, due))) == true) {
				view.showBoard(model);
				return new Winner((currentPlayer(uno, due)).getId());
			}
			opponent();

		}

		return new Winner("Tie");

	}


	/**
	 * Metodo per determinare il giocatore corrente
	 * @param Player uno
	 * @param Player due
	 * @return il giocatore corrente
	 */
	public Player currentPlayer(Player uno, Player due) {
		if (current() % 2 == 0) {
			return uno;
		} else
			return due;
	}

}
