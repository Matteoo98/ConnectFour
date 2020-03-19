package Game;

import java.io.IOException;

import Controller.ConfigController;
import Controller.Controller;
import Controller.gestioneInput;
import Exception.Forza4Exception;
import Model.Board;
import Model.Disco;
import Player.Player;
import Player.playerFactory;
import Player.playerRegistry;
import View.ColorConsole;
import View.View;
import View.ViewInterface;

/**
 * <b>Responsabilità:</b> Costruisce un gioco qualsiasi  
 */
public class GameBuilder {
	
	private ConfigController controllerConfig= new ConfigController();
	/**
	 * Costruttore del gioco Forza4
	 * @param Player 1
	 * @param Player 2
	 * @param disco 1
	 * @param disco 2
	 * @param controller
	 * @param view
	 * @param board
	 * @param io
	 * @param game
	 * @throws IOException
	 * @throws Forza4Exception 
	 */
	public void builderForza4(Player p1, Player p2, Disco disco, Disco discostu, Controller controller, ViewInterface view, Board board, gestioneInput io, GameInterface game) throws IOException, Forza4Exception {
		board = new Board(7,6);
		disco=new Disco();
		discostu= new Disco();
		view= new View();
		io=new gestioneInput(view);
		controller=new Controller(io);
		game= new Game(view);
		String player1=io.askWhoPlay();
        String player2=io.askWhoPlay();
        playerFactory playerFactory1 = playerRegistry.getInstance().getPlayerFactoryFromString(player1);
		playerFactory playerFactory2 = playerRegistry.getInstance().getPlayerFactoryFromString(player2);
		p1 =playerFactory1.createPlayer(player1, disco);
		p2 =playerFactory2.createPlayer(player2, discostu);
		p1.getDisco().setForma(ColorConsole.BLUE_BRIGHT + " X" + ColorConsole.RESET);
		p2.getDisco().setForma(ColorConsole.RED_BRIGHT + " O" + ColorConsole.RESET);
		controllerConfig.controllaOggettoForza4(p1, p2, board, controller, view, io);
		game.start(p1, p2, board, controller, view, io);
		
		
		
	}

}
