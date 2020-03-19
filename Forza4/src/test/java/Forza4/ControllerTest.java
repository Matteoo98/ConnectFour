/**
 * 
 */
package Forza4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Controller.Controller;
import Controller.gestioneInput;
import Model.Board;
import Model.Disco;
import Player.Player;
import Player.interactivePlayer;
import View.View;

/**
 * <b>Responsabilità :</b> Testa le funzionalità del controller del gioco
 * 
 * @author Matteo
 *
 */
class ControllerTest {

	@Test
	public void checkWinner() {
		View view = new View();
		gestioneInput io = new gestioneInput(view);
		Controller controller = new Controller(io);
		Board board = new Board(7,6);
		Player pippo = new interactivePlayer("pippo", new Disco());
		pippo.getDisco().setForma("X");
		board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		assertTrue(controller.checkWinner(board, pippo));
	}
	@Test
	public void checkBoardFull() {
		View view = new View();
		gestioneInput io = new gestioneInput(view);
		Controller controller = new Controller(io);
		Board board = new Board(7,6);
		Player pippo = new interactivePlayer("pippo", new Disco());
		pippo.getDisco().setForma("X");
		for(int i=0;i<7;i++) {
    		board.insertDisc(i, pippo);
    		board.insertDisc(i, pippo);
    		board.insertDisc(i, pippo);
    		board.insertDisc(i, pippo);
    		board.insertDisc(i, pippo);
    		board.insertDisc(i, pippo);
    	}
		assertTrue(controller.boardIsFull(board));
	}

}
