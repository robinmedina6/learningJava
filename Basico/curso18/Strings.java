import java.util.Scanner;
public class Strings{
  public static void main(String args[]){
     // declaramos nuestras variables
     String stringOne = "";
     Scanner scannerOne = new Scanner(System.in);
     int inputInitialPosition = 0, inputFinalPosition=0 ;
     // pedimos los datos
     System.out.println("Enter The firts String");
     stringOne = scannerOne.nextLine();
     System.out.println("The length of the String is: " + stringOne.length());
     // pedimos datos para cortar cadena 
     System.out.print("Enter initial Position to Cut:");
     inputInitialPosition = scannerOne.nextInt();
     System.out.print("Enter Final Position to Cut:");
     inputFinalPosition = scannerOne.nextInt();
     //cortamos la cadena y la mostramos
     System.out.println("the new String is:" + stringOne.substring(inputInitialPosition, inputFinalPosition));
 
     
     
  }
}