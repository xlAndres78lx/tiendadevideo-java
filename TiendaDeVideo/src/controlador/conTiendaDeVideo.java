package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

// Implementar ActionListener para poder escuchar las acciones del frame
public class conTiendaDeVideo implements ActionListener {
   // Crear un objeto de la vista y modelo
   visTiendaDeVideo vistaTienda = new visTiendaDeVideo();
   modTiendaDeVideoCrud modeloTienda = new modTiendaDeVideoCrud();
   // Crear constructor para inicializar los objetos
   public conTiendaDeVideo(visTiendaDeVideo vistaTienda, modTiendaDeVideoCrud modeloTienda){
      // Inicializar los objetos
      this.modeloTienda = modeloTienda;
      this.vistaTienda = vistaTienda;
      // Añadir el actionListener a los botones
      this.vistaTienda.btnRegistrar.addActionListener(this);
      this.vistaTienda.btnEliminar.addActionListener(this);
      this.vistaTienda.btnLimpiar.addActionListener(this);
      this.vistaTienda.btnActualizar.addActionListener(this);
          
   }
   // Crear la función para poder ejecutar eventos
   public void actionPerformed(ActionEvent e){
      // Función para el botón Limpiar
      if(e.getSource()==vistaTienda.btnLimpiar){
         vistaTienda.txtNom.setText("");
         vistaTienda.txtDoc.setText("");
         vistaTienda.txtDir.setText("");
         vistaTienda.txtTel.setText("");
         vistaTienda.txtPel1.setText("");
         vistaTienda.txtPel2.setText("");
      }
      // Función para el botón Registrar
      if(e.getSource()==vistaTienda.btnRegistrar){
         // Capturar valores
         String nombre = vistaTienda.txtNom.getText();
         String documento = vistaTienda.txtDoc.getText();
         String direccion = vistaTienda.txtDir.getText();
         String telefono = vistaTienda.txtTel.getText();
         String pelicula1 = vistaTienda.txtPel1.getText();
         String pelicula2 = vistaTienda.txtPel2.getText();
         // Ejecutar la función INSERT
         String respuesta = modeloTienda.insertTienda(nombre, documento, direccion, telefono, pelicula1, pelicula2);
         // Mostrar resultado
         JOptionPane.showMessageDialog(null,respuesta);
      }
      // Función para el botón Actualizar
      if(e.getSource()==vistaTienda.btnActualizar){
         // Capturar valores
         String nombre = vistaTienda.txtNom.getText();
         String documento = vistaTienda.txtDoc.getText();
         String direccion = vistaTienda.txtDir.getText();
         String telefono = vistaTienda.txtTel.getText();
         String pelicula1 = vistaTienda.txtPel1.getText();
         String pelicula2 = vistaTienda.txtPel2.getText();
         // Ejecutar la función UPDATE
         String respuesta = modeloTienda.updateTienda(nombre, documento, direccion, telefono, pelicula1, pelicula2);
         // Mostrar resultado
         JOptionPane.showMessageDialog(null,respuesta);
      }
      // Función para el botón Eliminar
      if(e.getSource()==vistaTienda.btnEliminar){
         // Capturar valores
         String documento = vistaTienda.txtDoc.getText();
         // Ejecutar la función DELETE
         String respuesta = modeloTienda.deleteTienda(documento);
         // Mostrar resultado
         JOptionPane.showMessageDialog(null,respuesta);
      }
      // Funcion para el botón Cerrar
      if(e.getSource()==vistaTienda.btnCerrar){
         
      }
   }
}