
package main;

public class ConsultaSaldo extends Cajero {
    
    int saldoObtenido=0;
    @Override
    public boolean Operacion(int valor){
        saldoObtenido=super.saldo;
        if(saldoObtenido == super.saldo){
            return true;
        }else{
            return false;
        }
    }
        
}
