public class ControlHorasTrabajadas {
    public static void main(String[] args) {
        String[] empleados = {"Juan", "María", "Carlos", "Ana"};
        int[] horasTrabajadas = {40, 35, 45, 30};
        double[] pagosSemanales = calcularPagoSemanal(horasTrabajadas);

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado: " + empleados[i] + ", Pago semanal: $" + pagosSemanales[i]);
        }
    }

    public static double[] calcularPagoSemanal(int[] horasTrabajadas) {
        double[] pagosSemanales = new double[horasTrabajadas.length];
        double tarifaPorHora = 15.0;

        for (int i = 0; i < horasTrabajadas.length; i++) {
            pagosSemanales[i] = horasTrabajadas[i] * tarifaPorHora;
        }

        return pagosSemanales;
    }
}
