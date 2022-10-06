/*
*clase para las funciones logicas de la lavadora
*
 */
package libreria;

public class LLFunciones {

    private int kilos = 0, llenadoCompleto = 0, tipoDeRopa = 0, lavadoCompleto = 0, secadoCompleto;

    public LLFunciones(int kilos, int tipoDeRopa) {
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }

    private void Llenado() {
        if (getKilos() <= 12) {
            setLlenadoCompleto(1);
            System.out.println("llenando..");
            System.out.println("llenado completo");
        } else {
            System.out.println("la carga es muy pesada");
        }
    }

    private void Lavado() { //este metodo sirva para lavar
        Llenado();
        if (getLlenadoCompleto() == 1) {
            if (tipoDeRopa == 1) {
                System.out.println("ropa blanca / lavado suave");
                System.out.println("lavando...");
                setLavadoCompleto(1);
            } else if (tipoDeRopa == 2) {
                System.out.println("ropa color / lavado intenso");
                System.out.println("lavando...");
                setLavadoCompleto(1);
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
        if (getLavadoCompleto() == 1) {
            System.out.println("secando");
            secadoCompleto = 1;
        }
    }

    public void CicloFinalizado() {
        Secado();
        if (getSecadoCompleto() == 1) {
            System.out.println("tu ropa esta lista");
        }
    }

    //setter and Getter
    public int getTipoDeRopa() {
        return tipoDeRopa;
    }

    public void setTipoDeRopa(int tipoDeRopa) {
        this.tipoDeRopa = tipoDeRopa;
    }

    /**
     * @return the kilos
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * @param kilos the kilos to set
     */
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    /**
     * @return the llenadoCompleto
     */
    public int getLlenadoCompleto() {
        return llenadoCompleto;
    }

    /**
     * @param llenadoCompleto the llenadoCompleto to set
     */
    public void setLlenadoCompleto(int llenadoCompleto) {
        this.llenadoCompleto = llenadoCompleto;
    }

    /**
     * @return the lavadoCompleto
     */
    public int getLavadoCompleto() {
        return lavadoCompleto;
    }

    /**
     * @param lavadoCompleto the lavadoCompleto to set
     */
    public void setLavadoCompleto(int lavadoCompleto) {
        this.lavadoCompleto = lavadoCompleto;
    }

    /**
     * @return the secadoCompleto
     */
    public int getSecadoCompleto() {
        return secadoCompleto;
    }

}
