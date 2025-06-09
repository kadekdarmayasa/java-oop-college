package bab_11;

public class App {
    public static void main(String[] args) {
        MahasiswaReguler darma = new MahasiswaReguler();
        darma.nama = "Darmayasa";
        darma.angkatan = "2023";
        darma.nim = "230030008";
        darma.prodi = "Sistem Informasi";

        darma.login();
        darma.cekAbsensi();
        darma.cekNilai();
    }
}
