public class T4 {

    public static void main(String[] args) {
        // [modificador] [tipo de retorno] [nombre]([parámetros]) {
        //     // cuerpo del método
        //     [return valor;]   // solo si devuelve algo
        // }
        
        // Ejercicio 4.1
        System.out.println("maximo(3, 9)  = " + maximo(3, 9));    // 9
        System.out.println("maximo(10, 4) = " + maximo(10, 4));   // 10
        
        // Ejercicio 4.2
        System.out.println("esPar(4)  = " + esPar(4));    // true
        System.out.println("esPar(7)  = " + esPar(7));    // false
        System.out.println("esPar(10) = " + esPar(10));   // true
        
        // Ejercicio 4.3
        System.out.println("sumaHasta(10) = " + sumaHasta(10));   // 55
        System.out.println("sumaHasta(100) = " + sumaHasta(100)); // 5050
    }

    // Ejercicio 4.1 (Método)
    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    // Ejercicio 4.2 (Método)
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    // Ejercicio 4.3 (Método)
    public static int sumaHasta(int n) {
        int suma = 0;
        int i = 1;
        while (i <= n) {
            suma = suma + i;
            i++;
        }
        return suma;
    }
}