
package clases;

public class ClaseHija_Retiro extends ClasePadre_Abstracta {
  
    @Override
    public void Transacciones(){
        System.out.print("Cuanto Deseas Retirar:  ");
        Retiro();
        if(retiro <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones-retiro);
            System.out.println("Retiraste:"+ retiro);
            System.out.println("Tu saldo Actual es: "+ getSaldo());
            System.out.println("================================");
        }else{
            System.out.println("Saldo Insuficiente");
        }
 }   
}
