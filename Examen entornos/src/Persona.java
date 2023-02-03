
public class Persona {
  
  String nombre;
  String apellido;
  int edad;
  
  public Persona(String nombre, String apellido, int edad) {
    
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    
  }
  
  public void cumpleaños() {
    edad = edad + 1;
    System.out.println(edad);
  }
  
  public void datosPersona() {
    System.out.println(nombre + apellido + edad);
  }

}
