package ejemplouno;
import java.util.Scanner;

public class EjemploUno {

    public static void main(String[] args) {
        System.out.print("hola");
        String cad = "", cadInvertida="";
        Scanner entrada1 = new Scanner(System.in);
        cad = entrada1.nextLine();
        for(int i = cad.length(); i>0; i--){
            cadInvertida+=cad.substring(i-1, i);
        }
        System.out.println(cadInvertida);
    }
    
}
