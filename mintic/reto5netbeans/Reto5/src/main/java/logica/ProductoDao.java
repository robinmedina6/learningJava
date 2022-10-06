package logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase que permite el acceso a la base de datos
 *
 * @author chenao
 *
 */
public class ProductoDao {

    public void registrarProducto(Producto miProducto) {
        try {
            Conexion conex = new Conexion();
            String sql = "INSERT INTO Producto (nombre,categoria,cantidad,precio) VALUES (?,?,?,?)";
            Connection cnx = conex.getConnection();
            PreparedStatement pstmt = cnx.prepareStatement(sql);
            pstmt.setString(1, miProducto.getNombre());
            pstmt.setString(2, miProducto.getCategoria());
            pstmt.setDouble(3, Double.parseDouble(miProducto.getCantidad() + ""));
            pstmt.setDouble(4, Double.parseDouble(miProducto.getPrecio() + ""));
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }

    public Producto buscarProducto(Producto producto) {
        Conexion conex = new Conexion();
        Producto Producto = new Producto();
        boolean existe = false;
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Producto where id = ? ");
            consulta.setInt(1, producto.getId());
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                existe = true;
                Producto.setId(Integer.parseInt(res.getString("id")));
                Producto.setNombre(res.getString("nombre"));
                Producto.setCategoria(res.getString("categoria"));
                Producto.setPrecio(Integer.parseInt(res.getString("precio")));
                Producto.setCantidad(Integer.parseInt(res.getString("cantidad")));
            }
            res.close();
            conex.desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }

        if (existe) {
            return Producto;
        } else {
            return null;
        }
    }

    public void modificarProducto(Producto miProducto) {
        Conexion conex = new Conexion();
        try {
            String consulta = "UPDATE Producto SET id= ? ,nombre = ? , cantidad=? , categoria=? , precio= ? WHERE id= ? ";
            PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);

            estatuto.setInt(1, miProducto.getId());
            estatuto.setString(2, miProducto.getNombre());
            estatuto.setDouble(3, Double.parseDouble(miProducto.getCantidad() + ""));
            estatuto.setString(4, miProducto.getCategoria());
            estatuto.setDouble(5, Double.parseDouble(miProducto.getPrecio() + ""));
            estatuto.setInt(6, miProducto.getId());
            estatuto.executeUpdate();

            JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public Boolean eliminarProducto(String codigo) {
        Conexion conex = new Conexion();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("DELETE FROM Producto WHERE id='" + codigo + "'");
            JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Elimino");
            return false;
        }
    }

    public ArrayList<Producto> llenarTabla() {
        Conexion conex = new Conexion();
         ArrayList lstProduto = new  ArrayList <Producto> ();  
        boolean existe = false;
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Producto");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                existe = true;
                Producto producto = new Producto();
                producto.setId(Integer.parseInt(res.getString("id")));
                producto.setNombre(res.getString("nombre"));
                producto.setCategoria(res.getString("categoria"));
                producto.setPrecio(Double.parseDouble(res.getString("precio")));
                producto.setCantidad(Integer.parseInt(res.getString("cantidad")));
                lstProduto.add(producto);
            }
            res.close();
            conex.desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }

        if (existe) {
            return lstProduto;
        } else {
            return null;
        }

    }

}
