import javax.swing.JOptionPane;

public class EntradaJOptionPane {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("ingrese el nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese nombre"));
		System.out.println("hola "+ nombre + " el a�o que viene tendras "+ (++edad) + "a�os");
		double resultado;
		resultado = Math.sqrt(10);
		System.out.printf("%1.2f",resultado);
		
	}
	
}
