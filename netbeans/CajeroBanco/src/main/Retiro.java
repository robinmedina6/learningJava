
package main;

public class Retiro extends Cajero {
    
    @Override
    public boolean Operacion(int valor){
        if(saldo>= valor){
          saldo-=valor;
          return true;
        }else{
          return false;
        }
    }
}
