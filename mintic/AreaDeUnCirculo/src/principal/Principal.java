package principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el radio: ");
		double radio = entrada.nextDouble();
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("el area es:"+area);
	}	

}

