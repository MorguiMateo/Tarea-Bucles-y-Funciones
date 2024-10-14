public class MostrarReducido {
    public static void main(String[] args) {
        for (char letra = 'Z'; letra >= 'A'; letra--) {
            for (char i = letra; i >= 'A'; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
