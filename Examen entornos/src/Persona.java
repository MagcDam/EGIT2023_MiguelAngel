
public class Persona {
  
  String nombre;
  String apellido;
  int edad;
  
  public Persona(String nombre, String apellido, int edad) {
    
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    
  }
  
  public void cumpleaños(int edad) {
    edad = edad + 1;
    System.out.println(edad);
  }

}
