package ejercicionumero8ob;

public class EjercicioNumero8OB {


    public static void main(String[] args) {
     /* Para practicar la encapsulación:
      Crear clase Persona.
      Crear variables las privadas edad, nombre y telefono de la clase Persona.
      Crear gets y sets de cada propiedad.
      Crear un objeto persona en el main.
      Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.*/
     
    Persona persona = new Persona();
    persona.setNombre("Pedro");
    persona.setEdad(33);
    persona.setTelefono(369369);
    
    System.out.println(persona.getNombre());
    System.out.println(persona.getEdad());
    System.out.println(persona.getTelefono());
    
    }
    
}
