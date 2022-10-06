package hola.gui;

import java.util.ArrayList;

import agenda.gui.Contacto;

public class Principal {
	
	private static ArrayList<Contacto> agenda;
	
	public static void main(String[] args) {
		agenda = new ArrayList<Contacto>();
		Ventana v1 = new Ventana(agenda);
		v1.setVisible(true);
	}
}
