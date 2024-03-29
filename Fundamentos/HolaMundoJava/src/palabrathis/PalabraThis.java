
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona.nombre:  = " + persona.nombre);
        System.out.println("persona.apellido:  = " + persona.apellido);
        
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        //super(); llamada al constructor de la clase padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto this: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    
    public Imprimir(){
        super();
    }
    
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("imprimir this: " + this);
    }
}