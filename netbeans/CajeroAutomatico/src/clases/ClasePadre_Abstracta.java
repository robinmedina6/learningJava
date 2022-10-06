package clases;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                //codigo
                System.out.println("Porfavor Seleccione una Opcion: ");
                System.out.println("    1. Consulta de saldo");
                System.out.println("    2. Retiro Efectivo");
                System.out.println("    3. Deposito Efectivo");
                System.out.println("    4. Salir");
                seleccion = entrada.nextInt();
                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("=========================================");
                    System.out.println("opcion no disponible, intente de nuevo");
                    System.out.println("=========================================");
                }
            } while (bandera == 0);
            if (seleccion == 1) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            } else if (seleccion == 2) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            } else if (seleccion == 3) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            } else if (seleccion == 4) {
                System.out.println("========================");
                System.out.println("!Gracias!, Vuelve Pronto");
                System.out.println("=========================");
                bandera = 2;
            }

        } while (bandera != 2);

        
    }
    
    
    
    // metodo para el retiro
    public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    // metodo para solicitar deposito
    
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    //metodo abstracto
    public abstract void Transacciones();
    // metodos getter y setter
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
