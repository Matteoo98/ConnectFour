/**
 * 
 */
package Forza4;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import Model.Board;
import Model.Disco;
import Player.Player;
import Player.interactivePlayer;

/**
 * <b>Responsabilit�:</b> Testa le funzionalit� del campo da gioco 
 * 
 * @author Matteo
 *
 */
class BoardTest {

    @Test
	public void createBoard() {
    	System.out.println("Test griglia : ");
		Board board = new Board(7, 6);
		System.out.print(board);
	}
    @Test
	public void checkHorizontalWin() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	System.out.println("Test horizontal win : ");
    	Player pippo = new interactivePlayer("pippo", new Disco());
		pippo.getDisco().setForma("X");
		Board board = new Board(7, 6);
		board.insertDisc(0, pippo);
		board.insertDisc(1, pippo);
		board.insertDisc(2, pippo);
		board.insertDisc(3, pippo);
		Method method = Board.class.getDeclaredMethod("checkHorizontal", Player.class);
		method.setAccessible(true);
		boolean result = (boolean) (method.invoke(board, pippo));
		assertTrue(result);
		System.out.print(board);
	}
    @Test
	public void checkVertical() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	System.out.println("Test vertical win : ");
    	Player pippo = new interactivePlayer("pippo", new Disco());
		pippo.getDisco().setForma("X");
		Board board = new Board(7, 6);
		board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		Method method = Board.class.getDeclaredMethod("checkVertical", Player.class);
		method.setAccessible(true);
		boolean result = (boolean) (method.invoke(board, pippo));
		assertTrue(result);
		System.out.print(board);
    }
    @Test
    public void checkDiagonalLeft() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	System.out.println("Test diagonal left win : ");
    	Player pippo = new interactivePlayer("pippo", new Disco());
		pippo.getDisco().setForma("X");
		Board board = new Board(7, 6);
		board.setDisco(6, 5, pippo);
		board.setDisco(5, 4, pippo);
		board.setDisco(4, 3, pippo);
		board.setDisco(3, 2, pippo);
		Method method = Board.class.getDeclaredMethod("checkDiagonalLowerLeft", Player.class);
		method.setAccessible(true);
		boolean result = (boolean) (method.invoke(board, pippo));
		assertTrue(result);
		System.out.print(board);
    }
    @Test
    public void checkDiagonalRight()throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	System.out.println("Test diagonal right win : ");
    	Player pippo = new interactivePlayer("pippo", new Disco());
		pippo.getDisco().setForma("X");
		Board board = new Board(7, 6);
		board.setDisco(0, 5, pippo);
		board.setDisco(1, 4, pippo);
		board.setDisco(2, 3, pippo);
		board.setDisco(3, 2, pippo);
		Method method = Board.class.getDeclaredMethod("checkDiagonalLowerRight", Player.class);
		method.setAccessible(true);
		boolean result = (boolean) (method.invoke(board, pippo));
		assertTrue(result);
		System.out.print(board);
    }
    @Test
    public void checkBoardEmpty() {
    	Board board = new Board(7, 6);
    	assertFalse(board.boardIsFull());
    }
    @Test
    public void checkColumnFull() {
    	System.out.println("Test colonna piena : ");
    	Board board = new Board(7, 6);
    	Player pippo = new interactivePlayer("pippo", new Disco());
    	pippo.getDisco().setForma("X");
    	board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		board.insertDisc(0, pippo);
		assertTrue(board.checkColumnFull(0));
		System.out.print(board);
    }
    @Test
    public void checkBoardFull() {
    	System.out.println("Test griglia piena : ");
    	Board board = new Board(7, 6);
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
    	assertTrue(board.boardIsFull());
    	System.out.print(board);
    }
}
