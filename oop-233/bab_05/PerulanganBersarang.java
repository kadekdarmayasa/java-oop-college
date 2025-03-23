package bab_05;

public class PerulanganBersarang {
    public static void main(String[] args) {
        // Inisialisasi variabel
        int x, y;

        // Perulangan yang menjadi sarang
        for(x = 0; x < 10; x++) {
            // Perulangan yang bersarang
            for(y = 0; y <= x; y++) {
                // Cetak bintang
                System.out.print("*");
            }
            // Cetak end line
            System.out.println();
        }
    }
}
