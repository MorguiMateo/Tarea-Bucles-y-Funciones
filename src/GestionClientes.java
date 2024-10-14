public class GestionClientes {

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println("- " + clientes[i] + ": $" + facturasPendientes[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] clientes = {"Juani Martin", "Renzito", "Carlos López", "Maxi elguerrero", "Luis Fernández"};

        double[] facturasPendientes = {300.75, 850.50, 400.00, 600.30, 1500.00};

        enviarFacturas(clientes, facturasPendientes);
    }
}
