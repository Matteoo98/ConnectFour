package View;

import Model.Model;

/**
 * <b>Responsabilità:</b> Implementa una vista del gioco forza4
 */

public class View implements ViewInterface {
	

	/**
	 * Costruttore della view
	 */
	public View() {
	}

	@Override
	public void showBoard(Model m) {
		System.out.print(m);
	}

	@Override
	public void notifyBoardFull() {
		System.out.println(ColorConsole.RED_UNDERLINED + "--------> The board is full !!\n" + ColorConsole.RESET);
	}

	@Override
	public void askWhoPlay() {
		System.out.println(ColorConsole.BLUE_BOLD + "\nInserisci il nome del giocatore" + ColorConsole.RESET);
	}

	@Override
	public void notifyWin(String s, String player) {
		System.out.println(ColorConsole.GREEN_UNDERLINED + "Il giocatore " + player + " ha vinto " + s + " !!\n" + ColorConsole.RESET);
	}

	@Override
	public void notifyColumnFull() {
		System.out.println(ColorConsole.RED + "La colonna e' piena !\n" + ColorConsole.RESET);
	}

	@Override
	public void playerTurn(String s) {
		System.out.println(ColorConsole.BLUE_BOLD + "Turno del giocatore : " + ColorConsole.RESET + s);
	}

	@Override
	public void botColumnChoose(int c) {
		System.out.println(ColorConsole.BLUE_BOLD + "Il Bot ha scelto la colonna : " + ColorConsole.RESET + c + "\n");
	}

	@Override
	public void askColumn() {
		System.out.println(ColorConsole.BLUE_BOLD + "Scegli la colonna dove far cadere il disco " + ColorConsole.RESET);
	}

	/**
	 * Menu del gioco
	 */
	public static void menu() {
		System.out.println(ColorConsole.BLUE_BOLD + "**************************************************");
		System.out.println("*\t\t" +" "+ " "+ " "+ " "+" " + "~ MENU ~" +" "+ " "+ " "+ " "+" " + "\t\t *");
		System.out.println("**************************************************\n*\t\t\t\t\t\t *");
		System.out.println("*\t1  - \tForza4\t\t\t\t *");
		System.out.println("*\t2  - \tPer un altro gioco \t\t *");
		System.out.println("*\t3  - \tEsci\t\t\t\t * \n*\t\t\t\t\t\t *");
		System.out.println("**************************************************\n" + ColorConsole.RESET);
		System.out.println(ColorConsole.BLUE_BOLD + "Scegliere un numero per l'opzione desiderata :" + ColorConsole.RESET);
	}

	@Override
	public void columnInputError() {

		System.out.println(ColorConsole.RED + "Input error : inserisci un numero intero compreso tra 0 e 6\n" + ColorConsole.RESET);
	}

}
