package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {
	public static void main(String[] args) {
		DameLaHora oyente = new DameLaHora();
		/*ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date hora = new Date();
				System.out.println("te doy la hora cada seg"+ hora );
			}
		};*/
		Timer miTemporizador = new Timer(1000,oyente);
		miTemporizador.start();
		JOptionPane.showMessageDialog(null, "para que no se cierre");
	}
	
}

class DameLaHora implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("te pongo la hora cad 5 sg" + ahora);
		Toolkit.getDefaultToolkit().beep();
	}
}