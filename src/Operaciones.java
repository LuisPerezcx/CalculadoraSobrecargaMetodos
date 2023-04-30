public class Operaciones {
    public void Resultados() {

        int a = 2;
        int b = 3;

        double c = 2.5;
        double d = 3.7;

        float e = 2.5f;
        float f = 3.7f;

        char g = 'a';
        char h = 'b';

        System.out.println("-- S U M A --");
        int resultadoEntero = Calculadora.sumar(a, b);
        double resultadoDouble = Calculadora.sumar(c, d);
        float resultadoFloat = Calculadora.sumar(e, f);
        char resultadoChar = Calculadora.sumar(g, h);
        System.out.println("El resultado de la suma de " + a + " y " + b + " es: " + resultadoEntero);
        System.out.println("El resultado de la suma de " + c + " y " + d + " es: " + resultadoDouble);
        System.out.println("El resultado de la suma de " + e + " y " + f + " es: " + resultadoFloat);
        System.out.println("El resultado de la suma de " + g + " y " + h + " es: " + resultadoChar);

        System.out.println("\n-- R E S T A --");
        resultadoEntero = Calculadora.restar(a, b);
        resultadoDouble = Calculadora.restar(c, d);
        resultadoFloat = Calculadora.restar(e, f);
        resultadoChar = Calculadora.restar(g, h);
        System.out.println("El resultado de la resta de " + a + " y " + b + " es: " + resultadoEntero);
        System.out.println("El resultado de la resta de " + c + " y " + d + " es: " + resultadoDouble);
        System.out.println("El resultado de la resta de " + e + " y " + f + " es: " + resultadoFloat);
        System.out.println("El resultado de la resta de " + g + " y " + h + " es: " + resultadoChar);

        System.out.println("\n-- M U L T I P L I C A C I O N --");
        resultadoEntero = Calculadora.multiplicar(a, b);
        resultadoDouble = Calculadora.multiplicar(c, d);
        resultadoFloat = Calculadora.multiplicar(e, f);
        resultadoChar = Calculadora.multiplicar(g, h);
        System.out.println("El resultado de la multiplicacion de " + a + " y " + b + " es: " + resultadoEntero);
        System.out.println("El resultado de la multiplicacion de " + c + " y " + d + " es: " + resultadoDouble);
        System.out.println("El resultado de la multiplicacion de " + e + " y " + f + " es: " + resultadoFloat);
        System.out.println("El resultado de la multiplicacion de " + g + " y " + h + " es: " + resultadoChar);

        System.out.println("\n-- D I V I C I O N --");
        resultadoEntero = Calculadora.dividir(a, b);
        resultadoDouble = Calculadora.dividir(c, d);
        resultadoFloat = Calculadora.dividir(e, f);
        resultadoChar = Calculadora.dividir(g, h);
        System.out.println("El resultado de la divicion de " + a + " y " + b + " es: " + resultadoEntero);
        System.out.println("El resultado de la divicion de " + c + " y " + d + " es: " + resultadoDouble);
        System.out.println("El resultado de la divicion de " + e + " y " + f + " es: " + resultadoFloat);
        System.out.println("El resultado de la divicion de " + g + " y " + h + " es: " + resultadoChar);
    }
}
