package bab_09;

class Mahasiswa {
    // Deklarasi variabel private
    private String prodi = "Sistem Informasi";

    // Variabel getter untuk variabel prodi
    public String getProdi() {
        return this.prodi;
    }
}

public class Contoh2Encapsulation {
    public static void main(String[] args) {
        // Deklarasi objek u/ class Mahasiswa
        Mahasiswa agus = new Mahasiswa();

        // Memanggil data melalui getter
        System.out.println("Prodi agus adalah : " + agus.getProdi());
    }
}