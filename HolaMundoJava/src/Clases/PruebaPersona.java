
package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.getInformacion();
        
        Persona persona2 = new Persona ();
        persona2.getInformacion();
        persona1.nombre = "Karla";
        persona1.apellido = "Lara";
        persona1.getInformacion();
        
    }
}
