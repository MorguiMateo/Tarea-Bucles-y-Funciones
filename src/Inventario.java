public class Inventario {

    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Reporte de Bajo Stock:");
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println("- " + productos[i] + ": " + stocks[i] + " unidades");
            }
        }
    }

    public static void main(String[] args) {
        String[] productos = {"Televisor", "Computadora", "Smartphone", "Auriculares", "Impresora", "Teclado"};

        int[] stocks = {2, 10, 1, 4, 8, 3};

        generarReporteBajoStock(productos, stocks);
    }
}
