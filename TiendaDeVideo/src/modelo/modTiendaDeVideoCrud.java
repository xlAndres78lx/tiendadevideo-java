package modelo;
// importar librería sql y JOptionPane
import java.sql.*;
import javax.swing.JOptionPane;

public class modTiendaDeVideoCrud {
   // Crear variable de tipo conexion (osea la clase que esta creada dentro de este paquete)
   conexion conx;
   // Crear constructor para ejecutar automaticamente el código
   public modTiendaDeVideoCrud(){
      // llamamos a la conexión
      conx = new conexion();
   }
   // Crear el INSERT
   public String insertTienda(String nombre, String documento, String direccion, String telefono, String pelicula1, String pelicula2){
      // Crear variable que mostrará un resultado
      String resultado = null;
      // Intentar conectar a MySQL con try catch
      try{
         // Crear variable de tipo connection y obtener la conexión por el metodo getConexion
         Connection accesoDB = conx.getConexion();
         // Crear una variable de tipo PreparedStatement que permite ejecutar un insert
         PreparedStatement ps = accesoDB.prepareStatement("insert into usuarios (nombre,documento,direccion,telefono,pelicula1,pelicula2) values (?,?,?,?,?,?)");
         // Asignar la posición de la variable a cada ?
         ps.setString(1, nombre);
         ps.setString(2, documento);
         ps.setString(3, direccion);
         ps.setString(4, telefono);
         ps.setString(5, pelicula1);
         ps.setString(6, pelicula2);
         // Verificar si se insertaron registros
         int cantRegistros = ps.executeUpdate();
         if(cantRegistros>0){resultado = "Se han insertado los datos.";}
         else {resultado = "No se han insertado los datos.";}
      }
      // Si hay un error guardarlo en la variable e
      catch (Exception e){
         // Mostrar un mensaje con la variable e
         JOptionPane.showMessageDialog(null,"Se produjo un error: "+ e);
      }
      return resultado;
   }
   // Crear el UPDATE
   public String updateTienda(String nombre, String documento, String direccion, String telefono, String pelicula1, String pelicula2){
      // Crear variable que mostrará un resultado
      String resultado = null;
      // Intentar conectar a MySQL con try catch
      try{
         // Crear variable de tipo connection y obtener la conexión por el metodo getConexion
         Connection accesoDB = conx.getConexion();
         // Crear una variable de tipo PreparedStatement que permite ejecutar un update
         PreparedStatement ps = accesoDB.prepareStatement("update usuarios set nombre=?,direccion=?,telefono=?,pelicula1=?,pelicula2=? where documento=?");
         // Asignar la posición de la variable a cada ?
         ps.setString(1, nombre);
         ps.setString(2, direccion);
         ps.setString(3, telefono);
         ps.setString(4, pelicula1);
         ps.setString(5, pelicula2);
         ps.setString(6, documento);
         // Verificar si se actualizaron registros
         int cantRegistros = ps.executeUpdate();
         if(cantRegistros>0){resultado = "Se han actualizaro los datos.";}
         else {resultado = "No se han insertado los datos.";}
      }
      // Si hay un error guardarlo en la variable e
      catch (Exception e){
         // Mostrar un mensaje con la variable e
         JOptionPane.showMessageDialog(null,"Se produjo un error: "+ e);
      }
      return resultado;
   }
   // Crear el DELETE
   public String deleteTienda(String documento){
      // Crear variable que mostrará un resultado
      String resultado = null;
      // Intentar conectar a MySQL con try catch
      try{
         // Crear variable de tipo connection y obtener la conexión por el metodo getConexion
         Connection accesoDB = conx.getConexion();
         // Crear una variable de tipo PreparedStatement que permite ejecutar un insert
         PreparedStatement ps = accesoDB.prepareStatement("delete from usuarios where documento=?");
         // Asignar la posición de la variable a cada ?
         ps.setString(1, documento);
         // Verificar si se insertaron registros
         ps.executeUpdate();
         
      }
      // Si hay un error guardarlo en la variable e
      catch (Exception e){
         // Mostrar un mensaje con la variable e
         JOptionPane.showMessageDialog(null,"Se produjo un error:\n"+ e);
      }
      return resultado;
   }
}