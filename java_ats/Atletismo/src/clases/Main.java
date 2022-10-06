package clases;

import javax.swing.JOptionPane;

public class Main {
	public static Atleta obtenerGanador(Atleta atletas[]) {
		float tiempoPrevio = atletas[0].getTiempo();
		int indiceGanador=0;
		for (int i = 1; i < atletas.length; i++) {
			if(atletas[i].getTiempo()<tiempoPrevio) {
				tiempoPrevio=atletas[i].getTiempo();
				indiceGanador=i;
			}
		}
		return atletas[indiceGanador];
	}

	public static void main(String[] args) {
		int nroAtletas = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el nuemro de atletas: "));
		Atleta atletas[] = new Atleta[nroAtletas];

		for (int i = 0; i < atletas.length; i++) {
			atletas[i]= new Atleta(Integer.parseInt(JOptionPane.showInputDialog("ingrese el nro del atleta")),JOptionPane.showInputDialog("ingrese Nombre"),Float.parseFloat(JOptionPane.showInputDialog("ingrese tiempo: ")));
		}
		JOptionPane.showMessageDialog(null, obtenerGanador(atletas).obtenerInformacion());
	}
}
