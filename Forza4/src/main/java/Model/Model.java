package Model;

import Player.Player;

/**
 * <b>Responsabilità:</b> Definisce il modello per Forza 4.
 */
public interface Model {

	/**
	 * Metodo per l'inserimento del disco
	 * @param colonna
	 * @param player
	 * @return true or false
	 */
	boolean insertDisc(int c, Player player);

	/**
	 * Metodo per il controllo della vittoria
	 * @param Player
	 * @return La stringa contenente il tipo di vittoria
	 */
	String checkWinner(Player pippo);
	/**
	 * Metodo per resettare la matrice
	 */
	void reset();

	/**
	 * Metodo per controllare se la colonna scelta � piena
	 * @param colonna da controllare
	 * @return true or false
	 */
	boolean checkColumnFull(int c);
	/**
	 * Metodo per controllare se il campo da gioco � pieno
	 * @return true or false
	 */
	boolean boardIsFull();

}
