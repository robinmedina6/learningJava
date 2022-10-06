import java.util.Scanner;
public class MatrizDinamica {
  public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Enter rows and columns: ");
    int filas= entrada.nextInt(), contador = 1;
    int columnas = entrada.nextInt();
    
    int matriz[][] = new int[filas][columnas];

    for(int i = 0 ; i < filas; i++){
      for(int j = 0 ; j < columnas; j++){
        matriz[j][i] = contador;
        contador++;
      }
    }
    for(int i = 0 ; i < filas; i++){
      for(int j = 0 ; j < columnas; j++){
        System.out.print("[" + matriz[j][i] + "]");
      }
      System.out.println();
    }

  }
}