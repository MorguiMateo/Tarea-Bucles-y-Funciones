public class CalcularPrecioFinal {
    public static void main(String[] args) {
        double[] preciosOriginales = {100.0, 200.0, 150.0, 300.0};
        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);

        for (int i = 0; i < preciosFinales.length; i++) {
            System.out.println("Precio original: $" + preciosOriginales[i] + ", Precio final: $" + preciosFinales[i]);
        }
    }

    public static double[] calcularPrecioFinal(double[] preciosOriginales) {
        double[] preciosFinales = new double[preciosOriginales.length];
        double tasaDescuento = 0.10;

        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosFinales[i] = preciosOriginales[i] - (preciosOriginales[i] * tasaDescuento);
        }

        return preciosFinales;
    }
}
