public class Obrero extends Empleado {
   private String puesto;
   private float salarioDiario;
   
   public Obrero(int clave, String nombre, int edad, String puesto, float salarioDiario) {
      super(clave, nombre, edad);
      this.puesto=puesto;
      this.salarioDiario=salarioDiario;
   }
   
   //get y set
}