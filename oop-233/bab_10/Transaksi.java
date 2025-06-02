package bab_10;

public class Transaksi {
    public static void main(String[] args) {
        hitungTotal(20);
        hitungTotal(24.89f);
    }

    public static void hitungTotal(int total) {
        System.out.println("Total Int: " + total);
    }

    public static void hitungTotal(float total) {
        System.out.println("Total Float: " + total);
    }
}
