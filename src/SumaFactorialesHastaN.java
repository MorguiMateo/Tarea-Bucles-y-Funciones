import java.util.Scanner;

public class SumaFactorialesHastaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();
        long sumaFactoriales = 0;

        for (int i = 0; i <= N; i++) {
            sumaFactoriales += calcularFactorial(i);
        }

        System.out.println("La suma de los factoriales de 0 a " + N + " es: " + sumaFactoriales);
        scanner.close();
    }

    public static long calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
