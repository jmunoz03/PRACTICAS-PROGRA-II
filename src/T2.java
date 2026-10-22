public class T2 {

    public static void main(String[] args) {
        // Ejercicio 2.1
        int nota = 7;
        if (nota < 4) {
            System.out.println("Desaprobado");
        } else if (nota >= 4 && nota <= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Promocionado");
        }

        // Ejercicio 2.2
        int a = 5, b = 7, c = 12;
        
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        
        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        // Ejercicio 2.3
        int n = 55;
        if (n % 2 == 0) {
            System.out.println(n + " es par");
        } else {
            System.out.println(n + " es impar");
        }
        
        int a2 = 3, b2 = 9, c2 = 5;
        if (a2 >= b2 && a2 >= c2)      System.out.println("Mayor: " + a2);
        else if (b2 >= a2 && b2 >= c2) System.out.println("Mayor: " + b2);
        else                           System.out.println("Mayor: " + c2);
    }
}