import id.kumara.sedana.BankSampah;
import id.kumara.sedana.Nasabah;
import id.kumara.sedana.Setoran;

public class Main {
    public static void main(String[] args) {
        // Instansiasi objek BankSampah
        BankSampah bankSampah = new BankSampah();

        // Membuat dan menambahkan nasabah
        Nasabah darma = new Nasabah("NSB001", "Darma");
        bankSampah.tambahNasabah(darma);

        Nasabah adi = new Nasabah("NSB002", "Adi");
        bankSampah.tambahNasabah(adi);

        // Menampilkan daftar nasabah
        bankSampah.tampilkanNasabah();

        // Membuat dan menambahkan setoran
        Setoran setoran1 = new Setoran(
            "STR001", "2023-10-01", 100000, darma
        );
        bankSampah.tambahSetoran(setoran1);

        Setoran setoran2 = new Setoran(
            "STR002", "2023-10-02", 200000, adi
        );
        bankSampah.tambahSetoran(setoran2);

        // Menampilkan daftar setoran
        bankSampah.tampilkanSetoran();
    }
}