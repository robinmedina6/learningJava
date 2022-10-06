import java.util.Scanner;
public class Arreglos2{
  public static void main(String args[]){
    int lenArray = 0 ;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Input number of elements for array");
    lenArray= entrada.nextInt();
    int arreglo[] = new int[lenArray];
   
    for(int i = 0;i < arreglo.length ; i++){
      System.out.println("Enter Number: " + (i+1));
      arreglo[i] = entrada.nextInt();
    }
  
    for(int i=0;i < arreglo.length; i++){
      System.out.print(arreglo[i] + ", ");
    }  
   
  }
}
