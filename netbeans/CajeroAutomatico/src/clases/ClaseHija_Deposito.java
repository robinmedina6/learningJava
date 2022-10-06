
package clases;

/**
 *
 * @author robin_vfh49pm
 */
public class ClaseHija_Deposito extends ClasePadre_Abstracta {
  public void Transacciones(){
      System.out.println("Cuanto deseas Depositar: ");
      Deposito();
      transacciones=getSaldo();
      setSaldo(transacciones+deposito);
      System.out.println("---------------------------------------");
      System.out.println("Depositaste: "+ deposito);
      System.out.println("Tu saldo actual es: "+getSaldo());
      System.out.println("--------------------------------------");
              
  }   
 
}
