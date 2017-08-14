package modelo;

public class modTiendaDeVideo {
   // Crear variables para obtener o asignar valores
   String nombre, documento, direccion, telefono, pelicula1, pelicula2, alquiler;
   // Crear constructor para inicializar variables
   public modTiendaDeVideo(){
      nombre="";
      documento="";
      direccion="";
      telefono="";
      pelicula1="";
      pelicula2="";
      alquiler="";
   }
   // Crear metodos get y set para obtener y asignar datos
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getDocumento() {
      return documento;
   }

   public void setDocumento(String documento) {
      this.documento = documento;
   }

   public String getDireccion() {
      return direccion;
   }

   public void setDireccion(String direccion) {
      this.direccion = direccion;
   }

   public String getTelefono() {
      return telefono;
   }

   public void setTelefono(String telefono) {
      this.telefono = telefono;
   }

   public String getPelicula1() {
      return pelicula1;
   }

   public void setPelicula1(String pelicula1) {
      this.pelicula1 = pelicula1;
   }

   public String getPelicula2() {
      return pelicula2;
   }

   public void setPelicula2(String pelicula2) {
      this.pelicula2 = pelicula2;
   }

   public String getAlquiler() {
      return alquiler;
   }

   public void setAlquiler(String alquiler) {
      this.alquiler = alquiler;
   }
   
}