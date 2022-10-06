package operaciones;
import java.util.Scanner;

public class ClasePadre {
    protected int valor1,valor2,resultado;
    Scanner entrada = new Scanner(System.in);
    
//este metodo pide los valores al usuario
    
    public void PedirDatos(){
        System.out.println("Dame el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.println("Dame el segundo valor");
        valor2 = entrada.nextInt();
    }
    //este metodo muestra el resultado
    
    public void MostararResultado(){
        System.out.println(resultado);
    }
    
    
}
