package Player;

import Model.Disco;

/**
 * <b>Responsabilità:</b> Costruisce un player interattivo 
 */
public class interactivePlayerFactory implements playerFactory {

	@Override
	public Player createPlayer(String id, Disco disco) {

		return new interactivePlayer(id,disco);
	}
	
	

}
