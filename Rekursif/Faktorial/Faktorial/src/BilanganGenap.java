public class BilanganGenap {

    public static void main(String[] args) {
        int angka = 10; // Ganti dengan bilangan yang ingin Anda cek
        if (isGenap(angka)) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " adalah bilangan ganjil.");
        }
    }

    // Metode untuk mengecek apakah bilangan genap atau tidak menggunakan perulangan for
    public static boolean isGenap(int angka) {
        for (int i = 0; i <= angka; i += 2) {
            if (i == angka) {
                return true; // Jika n ditemukan dalam urutan bilangan genap, maka dianggap genap
            }
        }
        return false; // Jika n tidak ditemukan dalam urutan bilangan genap, maka dianggap ganjil
    }
}