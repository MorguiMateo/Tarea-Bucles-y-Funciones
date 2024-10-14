public class NombresPerfectos {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (esPerfecto(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPerfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
}
