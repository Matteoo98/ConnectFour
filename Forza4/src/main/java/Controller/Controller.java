package Controller;

import java.io.IOException;

import Model.Model;
import Player.Player;
/**
 * <b>Responsabilità:</b> Controllare tramite il Model le varie fasi della partita e comunicare con il Model.
 **/
public class Controller {
	
	/**
	 * Istanza della classe gestioneIO per il gestore dell'input.
	 */
	private gestioneInput io;
	/**
	 * Costruttore di un controller
	 * @param io , l'input controller
	 */
	public Controller(gestioneInput io) {
		
		this.io=io;
	}
	
/**
 * Metodo per il controllo della vittoria da parte di un giocatore
 * @param Model
 * @param Player
 * @return true or false
 */
	public boolean checkWinner(Model model,Player player) {
		if(model.checkWinner(player)!=null) {
			io.notifyWin(model.checkWinner(player) , player.getId());
			return true;
		}
		return false;
	}
	/**
	 * Metodo che prende il numero della colonna desiderata , e se la colonna non � piena , lo gestisce il Model nell'inserimento.
	 * @param Model
	 * @param colonna
	 * @param Player
	 * @throws IOException
	 */
	public void takeColumn(Model model , int c, Player player) throws IOException {
		int column;
		if(model.checkColumnFull(c)==false) {
			model.insertDisc(c , player);
		}else {
		 do{
			io.notifyColumnFull();
			column=io.askColumn(player);
			
			}while(model.checkColumnFull(column)==true);
		 model.insertDisc(column, player);
		}
		
	}
    /**
     * Metodo per il controllo della matrice se � piena.
     * @param Model
     * @return true or false
     */
	public boolean boardIsFull(Model model) {
		if(model.boardIsFull()==true) {
			io.notifyBoardFull();
			return true;
		}
		return false;
	}

}
