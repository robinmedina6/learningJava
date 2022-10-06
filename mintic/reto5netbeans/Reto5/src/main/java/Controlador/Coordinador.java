package controlador;

import java.util.ArrayList;
import logica.Logica;
import logica.Producto;
import presentacion.JFrameProducto;


public class Coordinador {

	private Logica miLogica;
        private JFrameProducto jFrameProducto;

    public void setjFrameProducto(JFrameProducto jFrameProducto) {
        this.jFrameProducto = jFrameProducto;
    }

    public JFrameProducto getjFrameProducto() {
        return jFrameProducto;
    }
	
	public Logica getMiLogica() {
		return miLogica;
	}
	public void setMiLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
	
//////////////////////////////////////////////////////////
	
	
	
	public void registrarProducto(Producto miProducto) {
		miLogica.validarRegistro(miProducto);
	}
	
	public Producto buscarProducto(Producto producto) {
		return miLogica.validarConsulta(producto);
	}
	
	public void actualizarProducto(Producto miProducto) {
		miLogica.validarModificacion(miProducto);
	}
	public boolean eliminarProducto(String codigo) {
		return miLogica.validarEliminacion(codigo);
	}
        public ArrayList  llenarTabla(){
            return miLogica.llenarTabla();
        }

}
