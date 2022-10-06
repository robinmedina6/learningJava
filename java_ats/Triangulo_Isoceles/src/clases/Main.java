package clases;

import java.util.Scanner;

public class Main {
	public static double mayorArea(Triangulo_Isoceles triangulos[]) {
		double area;

		area = triangulos[0].ObtenerArea();
		for (int i = 1; i < triangulos.length; i++) {
			if (triangulos[i].ObtenerArea() > area) {
				area = triangulos[i].ObtenerArea();
			}
		}

		return area;
	}


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double base, lado;
		int nTriangulos;

		System.out.println("digite el numero de triangulos a ingresar: ");
		nTriangulos = entrada.nextInt();
		Triangulo_Isoceles triangulos[] = new Triangulo_Isoceles[nTriangulos];
		for (int i = 0; i < triangulos.length; i++) {
			System.out.println("Introduzca los valores para el triuangulo " + (i + 1) + ":");
			System.out.println("introduzca la base: ");
			base = entrada.nextDouble();
			System.out.println("introduzca el lado: ");
			lado = entrada.nextDouble();
			// creamos el objeto
			triangulos[i] = new Triangulo_Isoceles(base, lado);
			// imprimimos los calculados
			System.out.println("El perimetri del triangulo es: " + triangulos[i].obtenerPerimetro());
			System.out.println("El area del triangulo es: " + triangulos[i].ObtenerArea());
		}
		
		System.out.println("\nEl area del triangulo de mayor superficie es : "+ mayorArea(triangulos));
	}
}
