
package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //costructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
        
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando contrusctor con arg");
    }
    
    //Metodo
    public void sumar(){
        int result = this.a + this.b;
        System.out.println("resultado = " + result);
    }
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        
        return this.sumarConRetorno();
    }
}
