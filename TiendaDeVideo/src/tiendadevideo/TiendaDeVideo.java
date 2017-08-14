package tiendadevideo;

import modelo.*;
import vista.*;
import controlador.*;

public class TiendaDeVideo {
   public static void main(String[] args) {
      // Crear un objeto para modelo vista y controlador
      modTiendaDeVideoCrud Modelo = new modTiendaDeVideoCrud();
      visTiendaDeVideo Vista = new visTiendaDeVideo();
      conTiendaDeVideo Controlador = new conTiendaDeVideo(Vista,Modelo);
      // Hacer visible la vista
      Vista.setVisible(true);
   }
}