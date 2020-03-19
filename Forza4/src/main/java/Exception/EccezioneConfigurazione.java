package Exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b>Reponsabilità:</b> Gestisce le eccezioni nella configurazione di gioco
 */

public class EccezioneConfigurazione extends Forza4Exception {
	
	public EccezioneConfigurazione() {
		Logger logger = Logger.getLogger("Forza4");
		String message = "Errore inaspettato nella configurazione del gioco. Si prega di riavviare o contattare i developer";
		Level level = Level.INFO;
		logger.log(level, message);
	}

}
