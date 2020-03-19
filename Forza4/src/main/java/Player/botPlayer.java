package Player;

import Model.Disco;

/**
 * <b>Responsabilit�:</b> Definisce un player bot controllato dalla CPU 
 */
public class botPlayer implements Player{
	/**
	 * Identificativo del bot
	 */
	String id;
	/**
	 * Disco del bot
	 */
	Disco disco;
	
	/**
	 * Costruttore di un giocatore bot
	 * @param id
	 * @param disco
	 */
	public botPlayer(String id , Disco disco) {
		this.disco=disco;
		this.id=id;
		
	}

	@Override
	public Disco getDisco() {
		return this.disco;
	}

	@Override
	public String getId() {
		return this.id;
	}

	
	

}
