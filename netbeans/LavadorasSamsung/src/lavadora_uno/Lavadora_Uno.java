
package lavadora_uno;
import libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora_Uno {
  public static void main(String args[]){
      Scanner entrada = new Scanner(System.in);
      System.out.println("la ropa es blanca o de color");
      System.out.println("presiona 1- ropa blanca /2- ropa color");
      int tipoDeRopa=entrada.nextInt();
      
      System.out.println("cuantos kilos de ropa: ");
      int kilos = entrada.nextInt();
      
      LLFunciones mensajero = new LLFunciones(kilos, tipoDeRopa);
      mensajero.setTipoDeRopa(2);
      mensajero.setKilos(15);
      System.out.println("El tipo de ropa es: "+ mensajero.getTipoDeRopa());
      mensajero.CicloFinalizado();
  }   
  
  
}
