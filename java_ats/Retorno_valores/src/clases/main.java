package clases;

import javax.swing.JOptionPane;

public class main {
public static void main(String [] args) {
	int n1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero1: "));
	int n2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero2: "));
	
	Operacion op = new Operacion();
	
	System.out.println("la suma es: "+ op.sumar(n1,n2));
	System.out.println("la resta es: "+ op.restar(n1,n2));
	System.out.println("la multiplicacion es: " +op.multiplicar(n1, n2));
	System.out.println("la division es: " +op.dividir(n1, n2));
	
	//op.MostrarResultado(suma, resta, multiplicacion, division);
	
	
}
}
