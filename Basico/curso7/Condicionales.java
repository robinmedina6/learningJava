public class Condicionales{
  public static void main(String args[]){
   int  operacion=3;
   int numUno=8;
   int numDos=4;
   int resultado=0;
   
   if(operacion==1){
     resultado=numUno+numDos;
     System.out.println("el resultado de la suma es:" + resultado);
   }else if(operacion==2){
     resultado=numUno-numDos;
     System.out.println("el resultado de la resta es:" + resultado);
   }else if(operacion==3){
     resultado=numUno*numDos;
     System.out.println("el resultado de la multiplicacion es:" + resultado);
   }else if(operacion==4){
        resultado=numUno/numDos;
     System.out.println("el resultado de la division es:" + resultado);
   }else{
     System.out.println("la opcion que elegiste no existe");
   }

 } 
}