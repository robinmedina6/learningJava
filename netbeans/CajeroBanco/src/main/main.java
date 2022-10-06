package main;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        int operacion = 0, valor = 0;
        Scanner entrada = new Scanner(System.in);
        while (operacion < 4) {
            System.out.println("Porfavor Seleccione una Opcion"
                    + "\n 1.Consulta de Saldo"
                    + "\n 2.Retiro de Efectivo"
                    + "\n 3.Deposito de Efectivo"
                    + "\n 4. Salir");
            operacion = entrada.nextInt();
            switch (operacion) {
                case 1:
                    ConsultaSaldo cs = new ConsultaSaldo();
                    cs.Operacion(1);
                    System.out.println("=================\nsu saldo actual es:" + cs.saldoObtenido + "\n==================");
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar?: ");
                    valor = entrada.nextInt();
                    Retiro retiro = new Retiro();
                    if (retiro.Operacion(valor)) {
                        System.out.println("retiraste: " + valor);
                    } else {
                    }
                    break;
                case 3:
                    System.out.println("cuanto desea consignar?: ");
                    valor = entrada.nextInt();
                    Deposito deposito = new Deposito();
                    if(deposito.Operacion(valor)){
                        System.out.println("depositaste: "+ valor);
                    }
                    
            }

        }
    }
}
