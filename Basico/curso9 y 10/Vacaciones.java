import java.util.Scanner;

public class Vacaciones{
  public static void main(String args[]){
    int clave = 0, anosAntiguedad=0, diasVacaciones=0;
    String nombre="";
    Scanner in=new Scanner(System.in);
    System.out.println("Bienvenido al Sistema vacacional Coca cola Company");

    System.out.println("Ingrese el Nombre");
    nombre = in.nextLine();

    System.out.println("Ingrese la Clave");
    clave = in.nextInt();


    System.out.println("Ingrese Años de Servicio");
    anosAntiguedad = in.nextInt();
    
    if(clave==1){
      if( anosAntiguedad == 1 ){
        diasVacaciones=6;
      }else if(anosAntiguedad>=2 && anosAntiguedad<=6){
        diasVacaciones=14;
      }else if(anosAntiguedad>=7){
        diasVacaciones=20;
      }else{
        System.out.println("error años servicio");
      }    
    }else if(clave==2){
      if(anosAntiguedad==1){
        diasVacaciones=7;
      }else if(anosAntiguedad>=2 && anosAntiguedad<=6){
        diasVacaciones=15;
      }else if(anosAntiguedad>=7){
        diasVacaciones=22;
      }else{
        System.out.println("error años antiguedad");
      }      
    }else if(clave==3){
      if(anosAntiguedad==1){
        diasVacaciones=10;
      }else if(anosAntiguedad>=2 && anosAntiguedad<=6){
        diasVacaciones=20;
      }else if(anosAntiguedad>=7){
        diasVacaciones=30;
      }else{
        System.out.println("error años antiguedad");
      } 
    }else{ 
      System.out.println("la clave no es valida"); 
    }
    System.out.println("el empleado: " + nombre + " tiene derecho a: " + diasVacaciones + " dias de vacaciones");
  }
}