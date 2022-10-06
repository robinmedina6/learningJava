package controlador;

import logica.Logica;
import presentacion.JFrameProducto;

public class Principal {
	
	Logica miLogica;
	JFrameProducto jframeproducto;
	Coordinador miCoordinador;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Principal miPrincipal=new Principal();
		miPrincipal.iniciar();
	}

	/**
	 * Permite instanciar todas las clases con las que trabaja
	 * el sistema
	 */
	private void iniciar() {
		/*Se instancian las clases*/
		jframeproducto=new JFrameProducto();
		miLogica=new Logica();
		miCoordinador= new Coordinador();
		
		/*Se establecen las relaciones entre clases*/
                jframeproducto.setCoordinador(miCoordinador);
         
		miLogica.setCoordinador(miCoordinador);
		
		/*Se establecen relaciones con la clase coordinador*/
                miCoordinador.setjFrameProducto(jframeproducto);
		miCoordinador.setMiLogica(miLogica);
				
		jframeproducto.setVisible(true);
                jframeproducto.llenarTabla();
	}

}
