package Player;

import Model.Disco;

/**
 * <b>Responsabilit�:</b> Costruisce un player bot 
 */
public class botPlayerFactory implements playerFactory{

	@Override
	public Player createPlayer(String id, Disco disco) {
		return new botPlayer(id,disco);
	}

}
