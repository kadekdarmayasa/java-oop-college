package bab_06;

public class Contoh1Array1D {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi nilai pada array
        String[] namaPeserta = { "Ayu", "Budi", "Citra", "Damar", "Emy", "Fadly" };
        // Menampilkan nilai setiap elemen array
        System.out.println("Daftar Peserta:");
        for (int i = 0; i < namaPeserta.length; i++) {
            System.out.println(namaPeserta[i]);
        }
    }
}