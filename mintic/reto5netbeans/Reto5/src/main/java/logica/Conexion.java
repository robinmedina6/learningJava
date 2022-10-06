    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author robin_vfh49pm
 */
public class Conexion {
   static String bd = "tienda_reto5";
   static String login = "postgres";
   static String password = "123456";
   static String url = "jdbc:postgresql://localhost:5432/"+bd;

   Connection conn = null;

   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         //Class.forName("org.postgresql.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
            System.out.println("Conección a base de datos "+bd+" OK");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      /*}catch(ClassNotFoundException e){
         System.out.println(e);*/
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
      conn = null;
   }

}
