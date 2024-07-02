public class Empleado {
   private int clave;
   private String nombre;
   private int edad;
   
   public Empleado(int clave, String nombre, int edad){
      this.clave = clave;
      this.nombre=nombre;
      this.edad = edad;
   }
   
   //get y set
   
   public int clave(){
      return clave;
   }
   
   public void setClave(int clave){
      this.clave = clave;
   }
   
   public String getNombre(){
      return nombre;
   }
   
   public void setNombre(String nombre){
      this.nombre = nombre;
   }
   
   public int getEdad(){
      return edad;
   }
   
   public void setEdad(int edad){
      this.edad = edad;
   }
   
 }