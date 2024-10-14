public class PromedioSatisfaccion {

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        double suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public static void main(String[] args) {
        int[] calificaciones = {5, 4, 3, 5, 2, 4, 5, 1, 4, 3};

        double promedio = calcularPromedioSatisfaccion(calificaciones);

        System.out.printf("Promedio de satisfacción del cliente: %.2f\n", promedio);
    }
}
