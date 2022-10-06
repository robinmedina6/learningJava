package seleccionfutbol;

import java.util.ArrayList;

public class Principal {
	public static ArrayList<SeleccionFutbol> lista1= new ArrayList<SeleccionFutbol>();
	public static void main(String[] args) {
		SeleccionFutbol james = new Jugador("james","Rodriguez",13, 25, 10, 9 );
		SeleccionFutbol fisio= new Fisioterapeuta("pepito", "entrenador",1234,30,"musculo");
		SeleccionFutbol dt = new DirectorTecnico("Reinaldo", "rueda", 10, 20, 1);
		lista1.add(james);
		lista1.add(fisio);
		lista1.add(dt);
		
		for(SeleccionFutbol sf:lista1) {
			System.out.println(sf.getNombre()+" "+ sf.getApellido());
			sf.entrenar();
		}
		
	}
}
