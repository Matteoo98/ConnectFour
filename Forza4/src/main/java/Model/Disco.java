package Model;

import View.ColorConsole;

/**
 * <b>Responsabilità:</b> Definisce una Pedina disco per Forza 4
 */

public class Disco extends Pedina {
	
	String forma;
	
	public Disco() {
		
	}

	public Disco(String string) {
		this.forma=string;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	@Override
	public String toString() {
		return this.forma;
	}

}
