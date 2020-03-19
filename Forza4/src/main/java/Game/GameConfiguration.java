package Game;

import java.io.IOException;
import Controller.Controller;
import Controller.gestioneInput;
import Exception.Forza4Exception;
import Model.Board;
import Model.Disco;
import Player.Player;
import View.ViewInterface;

/**
 * <b>Responsabilità:</b> Crea una configurazione per un gioco
 */
public class GameConfiguration {

	private Player p1;
	private Player p2;
	private Disco disco;
	private Disco discostu;
	private Controller controller;
	private ViewInterface view;
	private Board board;
	private gestioneInput io;
	private GameInterface game;
	GameBuilder builder = new GameBuilder();

	/**
	 * Creata la configurazione chiama il builder del gioco
	 * 
	 * @throws IOException
	 * @throws Forza4Exception
	 */
	public void callForza4Builder() throws IOException, Forza4Exception {

		
		builder.builderForza4(p1, p2, disco, discostu, controller, view, board, io, game);

	}

	
}
