import java.util.Scanner;

public class FactorialHastaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            System.out.println("Factorial de " + i + " es: " + calcularFactorial(i));
        }
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
