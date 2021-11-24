import java.util.Scanner;
public class HolaMundo {
    public static void main(String args[]) {
        
    //  Seccion 1: Fundamentos Java: Instalación Java y Apache Netbeans
        
    //  Tarea 1: Saludar
                
        //Escribe tu codigo aqui
        System.out.println("Hola Mundo desde Java");
    
    //--------------------------------------------------------------------------
        
    //  Sección 2: Fundamentos Java: Variables en Java
        
        //Variables
        
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        
        //Tipo Enteros y Tipo String  
        
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        
        //Inferencia de tipos
        
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        

        //Valores permitido en el nombre de variables
        
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        System.out.println("miVariable = " + miVariable);
        System.out.println("_miVariable = " + _miVariable);
        System.out.println("$miVariable = " + $miVariable);
        
        
        //Concatenacion
        
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); //Suma
        System.out.println(i + j + usuario);//Suma y contatenacion
        System.out.println(usuario + i + j);//Contexto cadena
        System.out.println(usuario + (i + j));//Uso de parentesis
        
        
        //Carecteres especiales
        
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        
        //Clase Scanner
        
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe tu titulo");
        titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        
        //Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        titulo = consola.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
        
        
    //  Tarea 2: Detalles Libro
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
        
    //--------------------------------------------------------------------------    
        
    //  Sección 3: Fundamentos de Java: Tipos Primitivos en Java
        
        //Tipos primitivos enteros : byte, short, int, long
                
        byte numeroByte = (byte)128;//Conversion de int a byte
        System.out.println("\nnumeroByte = " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("\nnumeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("\nnumeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("\nnumeroLong = " + numeroLong);
        System.out.println("Valor minimo Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo Long: " + Long.MAX_VALUE);
        
        
        //Tipos primitivos tipos Flotante
        
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("\nnumeroFloat = " + numeroFloat);
        System.out.println("Valor minimo Float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo Float: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("\nnumeroDouble = " + numeroDouble);
        System.out.println("Valor minimo Double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo Double: " + Double.MAX_VALUE);
        
        
        //Inferencia de Tipo con Var y tipos primitivos
        
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble_ = 10.0;
        System.out.println("numeroDouble = " + numeroDouble_);
        
        var numeroFloat_ = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat_);
        
        
        //Tipos primitivos tipo char
        
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varCharUnicode = '\u0021';
        System.out.println("varCharUnicode = " + varCharUnicode);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var varCharUnicode_ = '\u0021';
        System.out.println("varCharUnicode_ = " + varCharUnicode_);
        
        var varCharDecimal_ = (char)33;
        System.out.println("varCharDecimal_ = " + varCharDecimal_);
        
        var varCharSimbolo_ = '!';
        System.out.println("varCharSimbolo_ = " + varCharSimbolo_);
        
        int varIntSimbolo = '!';
        System.out.println("varIntSimbolo = " + varIntSimbolo);
        
        int letra = 'A';
        System.out.println("letra = " + letra);
        
        
        //Tipos primitivos tipo boolean
        
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        
        if (varBoolean){
            System.out.println("La bandera es verdadera");
        } 
        else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        System.out.println("\nedad = " + edad);
        
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        
        
        //Conversion de tipos primitivos 
        
        //De String a Int
        edad = Integer.parseInt("20");
        //var edad_ = "20";
        System.out.println("edad = " + (edad + 1));
        
        //De String a Double
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        //Pedir un valor
        //var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad");
        edad = Integer.parseInt( consola.nextLine());
        System.out.println("edad = " + edad);
        
        //De Numero a String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //De String a Char
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un carater");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        
    //  Tarea 3: Tienda de Libros
        
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
        
    //--------------------------------------------------------------------------
        
        
    //  Sección 4: Fundamentos Java: Operadores en Java
        
        //Operadores aritmeticos
        
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado producto = " + resultado);
        
        var resultadoD = (double)a / b;
        System.out.println("resultado cociente = " + resultadoD);
        
        resultado = (a % b);
        System.out.println("resultado modulo = " + resultado);
        
        if(b % 2 == 0)
            System.out.println("Es numero par.");
        else
            System.out.println("Es numero impar");
        
        
        //Operadores de asignación
        
        a = 3;
        b = 2;
        var c = a + 5 - b;
        System.out.println("c = " + c);
        
        a += 1;//a = a + 1
        System.out.println("a = " + a);
        
        a += 3;//a = a + 3
        System.out.println("a = " + a);
        
        a -= 2;//a = a - 2
        System.out.println("a = " + a);
        
        //Otros -> *= /= %=
        
        
        //Operadores unarios
        
        a = 3;
        b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var cB = true;
        var dB = !cB;
        System.out.println("c = " + cB);
        System.out.println("d = " + dB);
        
        
        //Incremento
        
        //1.preincremento
        var e = 3;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2.postincremento
        var g = 5;
        var h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //Decremento
        
        //1.predecremento
        i = 2;
        j = --i;
        System.out.println("i = " + j);
        System.out.println("j = " + j);
        //2postdecremento
        var k = 4;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
        
        //Operadores de igualdad y relaciones
        
        a = 3;
        b = 2;
        cB = (a == b);
        System.out.println("c = " + cB);
        
        dB = a != b;
        System.out.println("d = " + dB);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        var eB = cadena.equals(cadena2);
        System.out.println("e = " + eB);
        
        var fB = cadena.equals(cadena);//compara contenidos de cadenas
        System.out.println("f = " + fB);
        
        
        //Operadores Relacionales
        
        var gB = a >= b;
        System.out.println("g = " + gB);
        
        if(a % 2 == 0) {
            System.out.println("Es numero Par.");
        } else {
            System.out.println("Es numero Impar.");
        }
        edad = 30;
        var adulto = 18;
        if(edad >= adulto) {
            System.out.println("Es adulto");
        } else {
            System.out.println("Es menor de edad");
        }
        
        
        //Operadores Condicionales
        
        a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultadoB = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultadoB);
        
        if(resultadoB) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = true;
        var diaDescanso = true;
        
        if(vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        } 
        
        
        //Operador Ternario
        
        var resultadoS = 1 > 2 ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultadoS);
        
        var num = 9;
        resultadoS = (num % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println("resultado = " + resultadoS);
        
        
        //Precedencia de Operadores
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        
    //  Tarea 4: Rectangulo
        
        //Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        var alto = consola.nextInt();
        System.out.println("Proporciona el ancho: ");
        var ancho = consola.nextInt();
        System.out.println("Area: " + alto * ancho);
        System.out.println("Perimetro: " + (alto + ancho) * 2);
        
        
    // Tarea 5: EL mayor de dos números
    
        //Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el numero1: ");
        int numero1 = consola.nextInt();
        System.out.println("Proporciona el numero2: ");
        int numero2 = consola.nextInt();
        System.out.println("El numero mayor es: " + 
            (numero1 > numero2 ? numero1 : numero2));
        
    //--------------------------------------------------------------------------
        
        
    //  Sección 5: Fundamentos Java: Sentencias de Control
        
        //Sentencia de control if - else en Java
        
        var condicion = false;
        
        if(condicion) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }
        
        
        //Sentencia de control switch 
        
        int numero = 1;
        var textoS = "Numero desconocido";
        
        textoS = switch (numero) {
            case 1 -> "Numero uno";
            case 2 -> "Numero dos";
            case 3 -> "Numero tres";
            case 4 -> "Numero cuatro";
            default -> "Numero no encontrado";
        }; 
        
        System.out.println("numeroTexto = " + textoS);
        
        
        //Cálculo estación del año con switch
        
        var mes = 4;
        var estacionS = "Estacion desconocida";
        
        switch (mes) {
            case 1, 2, 12 -> {estacionS = "Invierno";}
            case 3, 4, 5 -> {estacionS = "Primavera";}
            case 6, 7, 8 -> {estacionS = "Verano";}
            case 9, 10, 11 -> {estacionS = "Otonio";}
            default -> {estacionS = "Caso no encontrado";}
        }
        
        System.out.println("estacion = " + estacionS);
        
        
    //  Tarea 6: Sistema de Calificaciones
        
        //Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10: ");
        float numeroF = consola.nextFloat();
        
        if(numeroF >= 9 && numeroF <= 10) {
            System.out.println('A');
        } else if (numeroF >= 8 && numeroF < 9) {
            System.out.println('B');
        } else if (numeroF >= 7 && numeroF < 8) {
            System.out.println('C');
        } else if (numeroF >= 6 && numeroF < 7) {
            System.out.println('D');
        } else if (numeroF >= 0 && numeroF < 6) {
            System.out.println('F');
        } else {
            System.out.println("Valor desconocido");
        }
        
    //--------------------------------------------------------------------------
        
        
    //  Sección 6: Fundamentos Java: Ciclos en Java
        
        //Ciclo While
        
        int contador = 0;
        
        while( contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }
        
        
        //Ciclo Do While
        
        contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 1);
        
        
        //Ciclo For
        
        for(i = 0;i < 3;i++) {
            System.out.println("contador = " + i);
        }
        
        
        //Palabras Break y Continue en Java
        
        for(i = 0;i < 10;i++) {
            if( i % 2 == 0){
                continue;
            }
            System.out.println("contador = " + i);
        }
    }
}
