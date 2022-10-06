import java.util.Scanner;
public class Strings{
  public static void main(String args[]){
   String nombre1 = "" , nombre2 = "" ;
   Scanner entrada = new Scanner(System.in);
   System.out.println("Ingrese el primer nombre:");
   nombre1 = entrada.nextLine();
   System.out.println("Ingrese el segundo nombre:");
   nombre2 = entrada.nextLine();
   if(nombre1.equalsIgnoreCase(nombre2)){
     System.out.println("ek nombre es igual");
   }else{
     System.out.println("el nombre es diferente");
   }
    
  }
}