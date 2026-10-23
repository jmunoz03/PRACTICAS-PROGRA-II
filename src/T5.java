/*
-this.titulo  =  titulo;
   │              │
   │              └── lo que me pasaron (el parámetro)
   └── dónde lo guardo (el dato de la canción)
   
- Crear (llama al constructor)
- Cancion c = new Cancion("Imagine", 183);
- 
- 2. Leer sus datos (con getters)
- String t = c.getTitulo();   // "Imagine"
- int d = c.getDuracion();    // 183
- 
- 3. Imprimirlo (llama a toString() automáticamente)
- System.out.println(c);      // "Imagine (183 s)"



public class T5 {

    // Atributos (los datos que guarda cada objeto)
    private String titulo;
    private int duracion;

    // Constructor (Como se crea un objeto)
    // un nuevo objeto de la clase dándole valores iniciales.
    public T5(String titulo, int duracion) {
    	
    	// "this.titulo" se refiere al atributo de la clase, 
        // y se le asigna el valor que recibe el parámetro "titulo" al crear el objeto
        this.titulo = titulo;
        this.duracion = duracion;
    }

    // Getters (Para leer los atributos privados desde afuera)
    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    // Otros métodos (Comportamiento)
    public String toString() {
        return titulo + " ( " + duracion + " s) ";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    }
}
*/


// ==========================================
// BLOQUE 1: Programa principal que instancia objetos y usa los Getters manualmente
// ==========================================
public class T5{
	public static void main (String[] args) {
		// Se crean los objetos c1 y c2 usando el constructor de la clase Cancion
		Cancion c1 = new Cancion("Bonita", 359);
		Cancion c2 = new Cancion("Bellaquita", 185);
		
		// Se imprimen los datos llamando explícitamente a los métodos getTitulo() y getDuracion()
		System.out.println("Cancion 1: " + c1.getTitulo() + " - " + c1.getDuracion() + " S ");
		System.out.println("Cancion 2: " + c2.getTitulo() + " - " + c2.getDuracion() + " S ");
	}
}


// ==========================================
// CLASE AUXILIAR 1: Definición con errores de tipeo originales ("Cancnion" y "reutrn")
// ==========================================
class Cancnion{
	private String titulo; // Atributo privado para el título
	private int duracion;  // Atributo privado para la duración
	
	// Constructor para inicializar los atributos
	public Cancion(String titulo, int duracion) {
		this.titulo = titulo;
		this.duracion = duracion;
	}
	
	// Getter para el título
	public String getTitulo() { return titulo; }
	
	// Getter para la duración (tiene un error de tipeo en "reutrn")
	public int getDuracion() { reutrn duracion; }
}


// ==========================================
// BLOQUE 2: Programa principal que imprime los objetos directamente
// ==========================================
public class T5{
	public static void main(String[] args) {
		// Se crean los objetos (nota el error tipográfico "Canncion" en c2)
		Cancion c1 = new Cancion("Bonita", 359);
		Canncion c2 = new Cancion("Bellaquita", 185);
		
		// Al imprimir el objeto directamente, Java ejecuta automáticamente el método toString()
		System.out.println(c1);
		System.out.println(c2);
	}
}


// ==========================================
// CLASE PRINCIPAL Y CORRECTA: Estructura ideal de la clase Cancion
// ==========================================
class Cancion{
	private String titulo; // Atributo privado que almacena el título
	private int duracion;  // Atributo privado que almacena la duración en segundos
	
	// Constructor: recibe los valores y los asigna a los atributos mediante 'this'
	public Cancion(String titulo, int duracion) {
		this.titulo = titulo;
		this.duracion = duracion;
	}
	
	// Getter: permite consultar el título desde afuera
	public String getTitulo() { return titulo; }
	
	// Getter: permite consultar la duración desde afuera
	public int getDuracion() { return duracion; }
	
	// toString: personaliza el texto que se muestra al imprimir el objeto por pantalla
	public String toString() {
		return titulo + " ( " + duracion + " s) ";
	}
}