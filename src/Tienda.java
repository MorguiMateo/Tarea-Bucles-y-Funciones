public class Tienda {

    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }

    public static void main(String[] args) {
        double[] ventas = {150.50, 200.75, 300.40, 250.60, 400.00,
                350.30, 280.90, 500.20, 450.00, 370.55,
                490.40, 120.20, 240.00, 300.30, 330.80,
                400.10, 450.15, 490.90, 430.60, 250.00,
                300.50, 200.00, 600.00, 700.10, 800.25,
                720.40, 650.80, 580.55, 500.00, 420.30};

        double totalIngresos = calcularIngresosMensuales(ventas);

        System.out.println("Total de ingresos mensuales: " + totalIngresos);
    }
}
