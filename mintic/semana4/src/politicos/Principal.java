package politicos;

import java.util.ArrayList;

public class Principal {
	private static ArrayList<Politico> listaPoliticos = new ArrayList<Politico>();
	public static void main(String[] args) {
		Diputado dip1 = new Diputado("pepito", "perez", "Santander", "representantes");
		Senador sen1 = new Senador("Pepita", "perez", "cundinamarca", "senado");
		listaPoliticos.add(dip1);
		listaPoliticos.add(sen1);
		for (Politico p:listaPoliticos) {
			System.out.println(p.getNombre()+" representa: "+p.getRegionRepresentada());
		}
	}
}
