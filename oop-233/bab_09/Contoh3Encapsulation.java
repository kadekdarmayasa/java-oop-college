package bab_09;

class Mahasiswa {
    // Deklarasi variabel private
    private String prodi;

    // Variabel setter untuk variabel programStudi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}

public class Contoh3Encapsulation {
    public static void main(String[] args) {
        // Deklarasi objek u/ class Mahasiswa
        Mahasiswa agus = new Mahasiswa();

        agus.setProdi("Sistem Informasi");
    }
}
