package Game;

import java.io.IOException;
import java.util.Scanner;
import Exception.EccezioneConfigurazione;
import Exception.Forza4Exception;
import View.ColorConsole;
import View.View;

/**
 * <b>Responsabilit�:</b> Definire un menu per la scelta. 
 */
public class Menu {
	/**
	 * Crea un menu con le relative sequenze alternative
	 * @throws IOException
	 * @throws Forza4Exception 
	 */
	public static void menu() throws IOException, Forza4Exception {
		
		int scelta = 0;
		boolean valid=false;
		Scanner scanner= new Scanner(System.in);
		View.menu();
		while(!valid) {
			
			do {	
				try {
			    String input = scanner.nextLine();
				scelta = Integer.parseInt(input);
				
				}catch(NumberFormatException e) {
					
					System.err.println(ColorConsole.RED_BOLD + "error" + ColorConsole.RESET);
				}
		
		}
		while(scelta<1 || scelta>3);
		valid=true;
	
		}
		switch(scelta) {
		
		case 1:
			try {
			GameConfiguration forza4Configuration = new GameConfiguration();
		    forza4Configuration.callForza4Builder();
		    }catch(EccezioneConfigurazione e) {
				
			}
			break;
			
		case 2 :
			
			System.out.println(ColorConsole.RED_BOLD + "working progress..." + ColorConsole.RESET);
			
		case 3 :
			
			break;
			
			
		}
		scanner.close();
		
	}

}
