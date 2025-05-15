package soal2;


public class Buku {
    // Atribut Buku
    public String judul;
    public String penulis;
    public String penerbit;
    public int tahunTerbit;

    // Constructor buku untuk menginisialisasi atribut
    public Buku(String judul, String penulis, String penerbit, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    // Menampilkan informasi buku
    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
