package clases;

public class Principal {
	public static void main(String[] args) {
		Vehiculo  misVehiculos[]  = new Vehiculo[4];
		
		misVehiculos[0]= new Vehiculo("GH67", "Ferrari", "a86");
		misVehiculos[1]= new  VehiculoTurismo(4, "78h", "Audi", "p14");
		misVehiculos[2]= new  VehiculoDeportivo(500, "48y", "Toyota", "kj8");
		misVehiculos[3]= new  VehiculoFurgoneta(2000, "jI9", "Toyota", "j9");
		
		for(Vehiculo Vehiculos: misVehiculos) {
			System.out.println(Vehiculos.mostrarDatos());
			System.out.println();
		}
	}
}
