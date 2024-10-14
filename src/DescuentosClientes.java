public class DescuentosClientes {

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Descuentos aplicados a los clientes:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println("- " + clientes[i] + ": 10% de descuento");
            } else {
                System.out.println("- " + clientes[i] + ": No califica para descuento");
            }
        }
    }

    public static void main(String[] args) {
        String[] clientes = {"Juani Martin", "Renzito", "Carlos López", "Elwarrior", "maxi el guerrero"};

        int[] compras = {12, 8, 15, 5, 11};

        calcularDescuentos(clientes, compras);
    }
}
