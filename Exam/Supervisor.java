public class Supervisor extends Empleado {
   private String departamento;
   private float salarioQuincenal;
   
   public Supervisor(int clave, String nombre, int edad, String departamento, float salarioQuincenal){
      super(clave, nombre, edad);
      this.departamento=departamento;
      this.salarioQuincenal=salarioQuincenal;   
   }
   
   //get y set
 }