package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import Exception.EccezioneConfigurazione;
import Exception.Forza4Exception;

/**
 * <b>Responsabilità:</b> Controlla la correttezza degli oggetti prima di avviare una partita.
 **/

public class ConfigController {
	
	public void controllaOggettoForza4(Object o, Object a,Object b, Object c,Object d, Object e) throws Forza4Exception {
		
		ArrayList<Object> list = new ArrayList<Object>(
		        Arrays.asList(o,a,b,c,d,e));
		
		for(Object x : list) {
			if(x==null) {
				throw new EccezioneConfigurazione();
			}
		}
	}
}
