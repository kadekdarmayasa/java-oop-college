package bab_05;

public class Latihan54 {
    public static void main(String[] args) {
        // Menampilkan segitiga siku-siku
        int x, y;

        for(x = 10; x > 0; x--) {
            for(y = 0; y < x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
