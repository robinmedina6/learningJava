package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal {
	public static void main(String[] args) {
		
		Map<Estudiante, Docente> mapSchool = new  HashMap<Estudiante, Docente>();
		Docente felipe = new Docente("Felipe","barrera","Matematicas");
		Estudiante est1= new Estudiante("Robinson","medina","c3", "Central");
		Estudiante est2= new Estudiante("Karen","Duran","c3", "Pepular");
		Estudiante est3= new Estudiante("Yenny","castiblanco","c3", "quintas");
		Estudiante est4= new  Estudiante("pepito","perez","t3", "Dorado");
		
		mapSchool.put(est1, felipe );
		mapSchool.put(est2, felipe );
		mapSchool.put(est3, felipe );
		mapSchool.put(est4, new Docente("carlos", "Jerez", "Ciencias"));
		
		for(Estudiante estudianteLLave: mapSchool.keySet()) {
			System.out.println(estudianteLLave.getNombre()+" "+estudianteLLave.getApellido()+" "+ estudianteLLave.getBarrio() + " "+ estudianteLLave.getCurso());
			System.out.println("Docente:" +mapSchool.get(estudianteLLave).getNombre()+" "+mapSchool.get(estudianteLLave).getApellido()+" MAT:"+mapSchool.get(estudianteLLave).getMateria());
		}
		
		
	}
}
