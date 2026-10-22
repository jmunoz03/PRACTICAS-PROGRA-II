public class T1 {
    public static void main(String[] args) {
        int Cantidad = 3;
        double precioUnitario = 150.75;
        String producto = "Cuadderno";
        boolean hayStock = true;
        double total = Cantidad * precioUnitario;
        System.out.println(Cantidad + " X " + producto +  " a " + precioUnitario + " = "  + total + "(Hay stock: )" +
        		hayStock);
      
    }
}