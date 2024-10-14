public class DescuentoCompras {
    public static void main(String[] args) {
        double[] compras = {450.0, 600.0, 300.0, 800.0};
        double[] comprasConDescuento = aplicarDescuento(compras);

        for (int i = 0; i < comprasConDescuento.length; i++) {
            System.out.println("Compra original: " + compras[i] + ", Con descuento: " + comprasConDescuento[i]);
        }
    }

    public static double[] aplicarDescuento(double[] compras) {
        double[] comprasConDescuento = new double[compras.length];
        double tasaDescuento = 0.15;
        double limiteCompra = 500.0;

        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > limiteCompra) {
                comprasConDescuento[i] = compras[i] - (compras[i] * tasaDescuento);
            } else {
                comprasConDescuento[i] = compras[i];
            }
        }

        return comprasConDescuento;
    }
}
