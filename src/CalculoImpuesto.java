public class CalculoImpuesto {
    public static void main(String[] args) {
        double[] facturas = {100.0, 200.0, 150.0, 300.0};
        double[] facturasConImpuesto = calcularImpuesto(facturas);

        for (int i = 0; i < facturasConImpuesto.length; i++) {
            System.out.println("Factura original: " + facturas[i] + ", Con impuesto: " + facturasConImpuesto[i]);
        }
    }

    public static double[] calcularImpuesto(double[] facturas) {
        double[] facturasConImpuesto = new double[facturas.length];
        double tasaImpuesto = 0.21;

        for (int i = 0; i < facturas.length; i++) {
            facturasConImpuesto[i] = facturas[i] + (facturas[i] * tasaImpuesto);
        }

        return facturasConImpuesto;
    }
}
