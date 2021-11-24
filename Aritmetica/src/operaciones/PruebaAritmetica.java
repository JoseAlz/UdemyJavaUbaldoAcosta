
package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        //Variable local 
        var a = 10;
        var b = 2;
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("arimetica1 a = " + aritmetica1.a);
        System.out.println("arimetica1 b = " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("arimetica2 a = " + aritmetica2.a);
        System.out.println("arimetica2 b = " + aritmetica2.b);
    }
    
    public static void miMetodo(){
        int c = 10;
        System.out.println("Otro metodo");
        
    }
}
