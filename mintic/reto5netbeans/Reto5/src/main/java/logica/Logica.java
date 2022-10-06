package logica;

import javax.swing.JOptionPane;

import logica.ProductoDao;
import logica.Producto;
import controlador.Coordinador;
import java.util.ArrayList;

public class Logica {

    private Coordinador miCoordinador;
    public static boolean consultaProducto = false;
    public static boolean modificaProducto = false;

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;

    }

    public void validarRegistro(Producto miProducto) {
        ProductoDao miProductoDao;
        if (!miProducto.getNombre().equals("")) {
            miProductoDao = new ProductoDao();
            miProductoDao.registrarProducto(miProducto);
        } else {
            JOptionPane.showMessageDialog(null, "el nombre esta vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

    }

    public Producto validarConsulta(Producto producto) {
        ProductoDao miProductoDao = null;

        try {
            if (producto.getId() > 0) {
                miProductoDao = new ProductoDao();
                consultaProducto = true;
            } else {
                JOptionPane.showMessageDialog(null, "el codigo debe se mayor a 0", "Advertencia", JOptionPane.WARNING_MESSAGE);
                consultaProducto = false;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un dato numerico", "Error", JOptionPane.ERROR_MESSAGE);
            consultaProducto = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
            consultaProducto = false;
        }

        return miProductoDao.buscarProducto(producto);
    }

    public void validarModificacion(Producto miProducto) {
        ProductoDao miProductoDao;
        if (miProducto.getNombre().length() > 2) {
            miProductoDao = new ProductoDao();
            miProductoDao.modificarProducto(miProducto);
            modificaProducto = true;
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de la Producto debe ser mayor a 2 letrads", "Advertencia", JOptionPane.WARNING_MESSAGE);
            modificaProducto = false;
        }
    }

    public Boolean validarEliminacion(String codigo) {
        ProductoDao miProductoDao = new ProductoDao();
        return miProductoDao.eliminarProducto(Integer.parseInt(codigo) + "");
    }
    
    public ArrayList llenarTabla(){
       ProductoDao miProductoDao = new ProductoDao();
        return miProductoDao.llenarTabla();
    }

}
