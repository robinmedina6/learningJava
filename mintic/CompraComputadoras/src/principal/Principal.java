package principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("numero Pcs: ");
		double nropcs= entrada.nextInt();
		System.out.println("Precio: ");
		double precio = entrada.nextDouble();
		double descuento=0;
		if(nropcs<5) {
			descuento = 0.1;			
		}else if(nropcs<10){
			descuento = 0.2;
		}else {
			descuento =0.4;			
		}
		double total = (nropcs*precio);
		 descuento = total*descuento;
				System.out.println("precio final: "+(total-descuento)+" Descuento: "+descuento);
	}
}
