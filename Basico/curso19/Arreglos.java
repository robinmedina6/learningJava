import java.util.Scanner;

public class Arreglos{
  public static void main(String args[]){
    int arregloUno[] = new int[5], numero = 0;
    Scanner entrada = new Scanner(System.in);
    System.out.println("enter numbers, one after another and after press enter");
    for(int i = 0;i < arregloUno.length(); i++){
    arregloUno[i]= entrada.nextInt();
    }
    System.out.println("imprimiendo array");
    for(int i = 0;i < arregloUno.length(); i++){
    System.out.print(arregloUno[i] + ",");
    }
    
  }
}
