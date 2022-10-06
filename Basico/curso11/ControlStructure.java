import java.util.Scanner;

public class ControlStructure{
  public static void main(String args[]){
    int numUno = 5 , numDos = 3 , resultado = 0;
    Scanner entrada = new Scanner(System.in);
    System.out.println("ingrese la operacion a realizar 1 suma 2 resta 3m..");
    int parametro = entrada.nextInt();
    System.out.println("numeros");
    numUno= entrada.nextInt();
    numDos= entrada.nextInt();
    switch(parametro){
      	case 1: resultado = numUno + numDos;
                System.out.println("el resultado de la suma es: " + resultado);
                break;
      	case 2: resultado = numUno - numDos;
                System.out.println("el resultado de la resta es: " + resultado);
                break;
      	case 3: resultado = numUno * numDos;
                System.out.println("el resultado de la multiplicacion es: " + resultado);
                break;
      	case 4: resultado = numUno / numDos;
                System.out.println("el resultado de la division es: " + resultado);
                break;
        default: System.out.println("Error, la operacion no existe");
                break;

    }
  }
}