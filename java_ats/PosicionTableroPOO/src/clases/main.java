package clases;

import javax.swing.JOptionPane;

public class main {
public static void main(String[] args) {
	Objeto ob = new Objeto();
	int posx = (int) (Math.random()*10);
	int posy = (int) (Math.random()*10);
	int opcion ;
	do {
	String imp = "";		
	
	for (int y=0; y<10;y++) {
		for (int x=0; x<10;x++) {
			if (ob.getPosicionX()==x && ob.getPosicionY()==y) {imp+="X";}else{imp+="O";}
		}
		imp+="\n";
	}
	imp += posx +":"+ posy;
	System.out.println(imp);
	do {
		 opcion = Integer.parseInt(JOptionPane.showInputDialog("opciones:"
				+ "1. mover a la derecha \n"
				+ "2. mover a la izquierda \n"
				+ "3. mover hacia abajo \n"
				+ "4. mover hacia arriba \n"
				+ "5. salir"));
		
	}while(opcion < 1 && opcion > 5);
	switch(opcion) {
	case 1:
		ob.moverDerecha();
		break;
	case 2: 
		ob.moverIzquierda();
		break;
	case 3:
		ob.moverAbajo();
		break;
	case 4: 
		ob.moverAbajo();
		break;
	case 5:
		System.exit(1);
		break;
	
	}
	}while(opcion!=5);
}
	
}
