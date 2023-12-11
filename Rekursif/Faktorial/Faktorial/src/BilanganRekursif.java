public class BilanganRekursif {

    static void bilangan(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            bilangan(n + 1);
        }
    }
    public static void main(String[] args) {
        bilangan(0);
    }
}