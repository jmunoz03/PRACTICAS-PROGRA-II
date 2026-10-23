
public class REPASO1_5 {}
	/* TEMA 1
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad = 3;
		double precio = 150.75;
		String producto = "cuaderno";
		boolean hayStock = true;
		System.out.println(cantidad + producto + " (s) a " + precio + " c/u  - hay stock: " + hayStock);
		
	*/

	/* TEMA 2.1
	public static void main(String[]args){
		
		int n = 35;
		if (n % 2 == 0){
            System.out.println(n + " es par");
        } else {
            System.out.println(n + " es impar");
        }

	}*/

	/* TEMA 2.2
		public static void main(String [] args){
   		 int a = 5, b = 7, c = 12;
  	 	 int mayor = a;
 		if (b > mayor) mayor = b;
 		 if (c > mayor) mayor = c;
   	 System.out.println("El mayor es: " + mayor);
	}  */ 

	/*	 TEMA 3
		public static void main(String[] args){
		int i = 1;
			while(i <= 5){
			if (i % 2 == 0){
				System.out.println(i);
			}
			i++; 
		} */ 

	/*
		TEMA 4
	  public	static	void main(String[] args){
		static int maximo(int a, int b){
			if (a > b){
				return a; // Si a es mas grande devuelve a
			} else {
				return b;// Si no, devuelve b
			}

		}
		static boolean esPositivo(int n){
			return n > 0;
		}

		public static void main(String[] args) {
        System.out.println(maximo(3, 7));    // 7
        System.out.println(esPositivo(5));   // true
    }
*/	

	

/*	 TEMA 5

 	public static void main(String[] args){
		Cancion c1 = new Cancion("bonita",213);
		Cancion c2 = new Cancion("Dificil",414);
		 System.out.println(c1.getTitulo() + " - " + c1.getDuracion());
   		 System.out.println(c2.getTitulo() + " - " + c2.getDuracion());
	}

	class Cancion{
		private String titulo;
		private int duracion;

		public Cancion(String titulo, int duracion){
			this.titulo = titulo;
			this.duracion = duracion;
		}
		public String getTitulo(){
			return titulo;
		}
		public int getDuracion(){
			return duracion;
		}



	CORECCION: 
	class Cancion {
    private String titulo;
    private int duracion;

     public Cancion(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }
}

public class T5 {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("bonita", 213);
        Cancion c2 = new Cancion("Dificil", 414);

        System.out.println(c1.getTitulo() + " - " + c1.getDuracion());
        System.out.println(c2.getTitulo() + " - " + c2.getDuracion());
    }
}
*/	
