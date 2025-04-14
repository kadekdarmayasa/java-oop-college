package bab_07;

class Mobil {
    String merkMobil;
    String tipeMobil;
    float bahanBakar;
    float jarakTempuh;

    // Constructor class Mobil
    public Mobil(String mm, String tm, float bb, float jt) {
        merkMobil = mm;
        tipeMobil = tm;
        bahanBakar = bb;
        jarakTempuh = jt;

        System.out.println("Telah dibeli sebuah mobil " + merkMobil + " dengan tipe " + tipeMobil + " yang memiliki " + bb + " liter bahan bakar dan jarak tempuh " + jarakTempuh);
    }

    void infoJarakTempuh() {
        System.out.println("Jarak tempuh : " + jarakTempuh);
    }

    void infoBahanBakar() {
        System.out.println("Sisa bahan bakar : " + bahanBakar);
    }

    void jalan(float km) {
        jarakTempuh += km;

        // Perhitungan konsumsi bahan bakar 1 liter / 10 km
        bahanBakar -= (km/10);
        System.out.println("Mobil berjalan sejauh " + km + " Km");
    }

    void isiBahanBakar(float liter) {
        bahanBakar += liter;
        System.out.println("Bahan bakar ditambah " + liter + " liter");   
    }
}

// Class utama
public class Mobilku {
    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil mobilKu = new Mobil("Honda", "HRV", 10, 0);

        // Menjalankan mobil sejauh 20 Km
        mobilKu.jalan(20);
        mobilKu.infoJarakTempuh();

        // Mengisi bahan bakar sebanyak 15 liter
        mobilKu.isiBahanBakar(15);
        mobilKu.infoBahanBakar();
    }
}
