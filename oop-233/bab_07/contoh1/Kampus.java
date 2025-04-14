public class Kampus {
    public static void main(String[] args) {
        // Membentuk objek dari class Manusia
        Manusia mahasiswa1 = new Manusia();
        Manusia mahasiswa2 = new Manusia();

        // Mengisi atribut mahasiswa
        mahasiswa1.nama = "Ayu";
        mahasiswa1.umur = 18;
        mahasiswa2.nama = "Bayu";
        mahasiswa1.umur = 19;

        // Memanggil method dari objek
        mahasiswa1.perkenalanDiri();
        mahasiswa2.perkenalanDiri();
    }
}
