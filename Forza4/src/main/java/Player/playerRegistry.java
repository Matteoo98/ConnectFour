package Player;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Responsabilit�:</b> Costruisce un registro dei giocatori 
 */

public class playerRegistry {
	
	/**
	 * Registro dei giocatori tramite un HashMap
	 */
	private Map<String, playerFactory> registry;
	/**
	 * Istanza del Player Registry
	 */
	private static final playerRegistry instance = new playerRegistry();
	/**
	 * Costruttore di un Player Registry , si inserisce di default un botPlayer
	 */
	private playerRegistry() {
		registry = new HashMap<String, playerFactory>();
		insertNewPlayerFactory("bot", new botPlayerFactory());
	}
	/**
	 * Metodo per accedere all'istanza del Player Registry
	 * @return istance
	 */
	public static playerRegistry getInstance() {
		
		return instance;
	}
	/**
	 * Metodo per l'inserimento di un player nel registry
	 * @param name
	 * @param playerFactory
	 */
	public void insertNewPlayerFactory(String name, playerFactory playerFactory) {
		registry.put(name, playerFactory);
	}
	/**
	 * Metodo per accedere ad un player factory tramite una stringa se la stringa � bot ( gi� la contiene , guarda costruttore ) 
	 * rimanda ad un botPlayerFactory , invece se si inserisce una qualsiasi stringa diversa da bot avvia un interactivePlayerFactory
	 * @param name
	 * @return playerFactory
	 */
	public playerFactory getPlayerFactoryFromString(String name) {
		if(registry.containsKey(name)) {
			return registry.get(name);
		}
		
		return new interactivePlayerFactory();
	}
	public void stampa() {
		for(Map.Entry<String, playerFactory> entry : registry.entrySet()) {
			System.out.println(entry);
		}
	}

}
