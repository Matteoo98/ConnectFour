package View;

import Model.Model;

/**
 * <b>Responsabilit�:</b> Definisce un vista del gioco forza4 basata sull'output della console 
 */
public interface ViewInterface {

	/**
	 * Metodo per stampare a video il campo da gioco
	 * @param model
	 */
	void showBoard(Model model);
	/**
	 * Metodo per notificare che il campo da gioco � pieno
	 */
	void notifyBoardFull();
	/**
	 * Metodo per chiedere chi gioca
	 */
	void askWhoPlay();
	/**
	 * Metodo per notificare che un giocatore ha vinto con una determinata combinazione
	 * @param combinazione vincente
	 * @param player vincente
	 */
	void notifyWin(String s, String string);
	/**
	 * Metodo per notificare che la colonna � piena
	 */
	void notifyColumnFull();
	/**
	 * Metodo per notificare di quale giocatore � il turno
	 * @param player name
	 */
	void playerTurn(String s);
	/**
	 * Metodo per notificare la colonna scelta dal bot
	 * @param colonna
	 */
	void botColumnChoose(int c);
	/**
	 * Metodo per chiedere la colonna dove far cadere il disco
	 */
	void askColumn();
	/**
	 * Metodo per notificare che un errore nell'inserimento della colonna desiderata
	 */
	void columnInputError();

}
