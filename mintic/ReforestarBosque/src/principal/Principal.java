package principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nrohectareas = entrada.nextInt();
		final double MTSXHECTAREA=10000;
		double terreno = nrohectareas * MTSXHECTAREA;
		double pino=0;
		double oyamel=0;
		double cedro=0;
		if (terreno>1000000) {
			pino = terreno * 0.7;
			oyamel= terreno * 0.2;
			cedro = terreno * 0.1;
			
		}else{
			pino = terreno * 0.5;
			oyamel= terreno * 0.3;
			cedro = terreno * 0.2;	
		}
		System.out.println("Terreno: "+ terreno +
							"\nPinos:"+ ((pino/10)*8)+
							"\nOyamel:"+((oyamel/15)*15)+
							"\nCedro:"+((cedro/18)*10));
	}
	
}
