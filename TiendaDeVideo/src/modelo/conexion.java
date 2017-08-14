package modelo;
// importar librería sql y JOptionPane
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
   // Crear metodo constructor
   public conexion(){
      // Irá vacío es solo para inicializar la conexión 
   }
   // Crear metodo para conectar con MySQL
   public Connection getConexion(){
      // Crear una variable de tipo connection para guardar la conexión
      Connection conx = null;
      // Intentar conectar con try y si aparece un error mostrarlo en catch
      try{
         // Llamar al driver MySQL
         Class.forName("com.mysql.jdbc.Driver").newInstance();
         // Conectar con MySQL
         conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendadevideo","root","");
      }
      // Si hay un error guardarlo en la variable e
      catch(Exception e){
         // Mostrar un mensaje con la variable e
         JOptionPane.showMessageDialog(null,"Se produjo un error: "+ e);
      }
      // Retornar la conexión. null si no conectó y la conexión si conectó
      return conx;
   }
}