/*
*clase para las funciones logicas de la lavadora
*
 */
package llfunciones;

public class LLFunciones {

    private int kilos = 0, llenadoCompleto = 0, tipoDeRopa = 0, lavadoCompleto = 0, secadoCompleto;

    public LLFunciones(int kilos, int tipoDeRopa) {
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }

    private void Llenado() {
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("llenando..");
            System.out.println("llenado completo");
        } else {
            System.out.println("la carga es muy pesada");
        }
    }

    private void Lavado() { //este metodo sirva para lavar
        Llenado();
        if (llenadoCompleto == 1) {
            if (tipoDeRopa == 1) {
                System.out.println("ropa blanca / lavado suave");
                System.out.println("lavando...");
                lavadoCompleto = 1;
            } else if (tipoDeRopa == 2) {
                System.out.println("ropa color / lavado intenso");
                System.out.println("lavando...");
                lavadoCompleto = 1;
            } else {
                System.out.println("el tipo de ropa no dispinible");
                System.out.println("se lavara como color / lavado intenso");
            }
        } else {
            System.out.println("no se pudo no esta llena");
        }
    }

    private void Secado() {//este metodo seca
        Lavado();
        if (lavadoCompleto == 1) {
            System.out.println("secando");
            secadoCompleto = 1;
        }
    }

    public void CicloFinalizado() {
        Secado();
        if (secadoCompleto == 1) {
            System.out.println("tu ropa esta lista");
        }
    }
}
