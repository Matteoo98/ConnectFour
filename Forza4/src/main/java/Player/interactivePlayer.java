package Player;
import Model.Disco;

/**
 * <b>Responsabilità:</b> Definisce un player interattivo 
 */
public class interactivePlayer implements Player{
	/**
	 * Identificativo del player
	 */
	String id;
	/**
	 * Disco del player
	 */
	Disco disco;
	
	/**
	 * Costruttore di un giocatore interattivo
	 * @param id
	 * @param disco
	 */
	public interactivePlayer(String id , Disco disco ) {
		this.id=id;
		this.disco=disco;
		
	}

	@Override
	public Disco getDisco() {
		return this.disco;
		
	}

	@Override
	public String getId() {
		return id;
	}


}
