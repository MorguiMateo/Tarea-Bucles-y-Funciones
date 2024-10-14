public class ContadorEspecial {
    public static void main(String[] args) {
        for (int i = 0; i <= 99999; i++) {
            String contador = String.format("%05d", i).replace('3', 'E');
            System.out.println(contador);
        }
    }
}
