package bab_09;

class Lingkaran {
    // Konstanta PI yang bersifat read-only (final)
    private static final double PI = Math.PI;
    
    // Atribut private untuk radius
    private double r = 0;
    
    // Getter untuk radius
    public double getR() {
        return r;
    }
    
    // Getter untuk PI
    public static double getPI() {
        return PI;
    }
    
    // Setter untuk radius
    public void setR(double r) {
        if (r >= 0) {
            this.r = r;
        } else {
            System.out.println("Radius tidak boleh negatif!");
        }
    }
    
    // Method untuk menghitung luas lingkaran
    public double hitungLuas() {
        return PI * r * r;
    }
    
    // Method untuk menghitung keliling lingkaran
    public double hitungKeliling() {
        return 2 * PI * r;
    }
    
    // Method untuk menghitung diameter
    public double hitungDiameter() {
        return 2 * r;
    }
    
    // Method untuk menampilkan informasi lingkaran
    public void tampilkanInfo() {
        System.out.println("=== Informasi Lingkaran ===");
        System.out.println("Nilai PI    : " + PI);
        System.out.println("Radius      : " + r);
        System.out.println("Diameter    : " + hitungDiameter());
        System.out.println("Keliling    : " + String.format("%.2f", hitungKeliling()));
        System.out.println("Luas        : " + String.format("%.2f", hitungLuas()));
        System.out.println("============================");
    }
}

public class Latihan92 {
    public static void main(String[] args) {
        // Membuat objek lingkaran menggunakan constructor default
        Lingkaran lingkaran1 = new Lingkaran();

        // Menggunakan setter untuk mengubah radius
        lingkaran1.setR(7.0);

        // Menampilkan informasi lingkaran
        lingkaran1.tampilkanInfo();
    }
}