package Player;

import Model.Disco;

/**
 * <b>Responsabilit�:</b> Definisce un costruttore di player 
 */
public interface playerFactory {
	/**
	 * Costruttore di un giocatore
	 * @param id
	 * @param disco
	 * @return player
	 */
	public Player createPlayer(String id , Disco disco);
	

}
