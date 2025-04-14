package bab_07;

class Hewan {
    String namaHewan;
    String suaraHewan;

    public Hewan(String nama, String suara) {
        namaHewan = nama;
        suaraHewan = suara;
    }

    void bersuara() {
        System.out.println("Suara dari " + namaHewan + " adalah " + suaraHewan);
    }
}

public class Latihan71 {
    public static void main(String[] args) {
        // Membuat 5 instances dari class Hewan
        Hewan kucing = new Hewan("Kucing", "Meow");
        Hewan anjing = new Hewan("Anjing", "Guk Guk");
        Hewan sapi = new Hewan("Sapi", "Moooo");
        Hewan ayam = new Hewan("Sapi", "Kukuruyuk");
        Hewan kambing = new Hewan("Kambing", "Mbeeek");
        
        // Memanggil method bersuara() untuk setiap instance
        kucing.bersuara();
        anjing.bersuara();
        sapi.bersuara();
        ayam.bersuara();
        kambing.bersuara();
    }
}
