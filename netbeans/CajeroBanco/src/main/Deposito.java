package main;

public class Deposito extends Cajero {

    @Override
    public boolean Operacion(int valor) {
        int saldotmp = saldo;
        saldo += valor;
        return saldo == saldotmp + valor;
    }

}
