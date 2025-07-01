package id.kumara.sedana;

import java.util.ArrayList;
import java.util.List;

public class BankSampah {
    private List<Nasabah> daftarNasabah = new ArrayList<>();
    private List<Setoran> daftarSetoran = new ArrayList<>();

    public void tambahNasabah(Nasabah nasabah) {
        daftarNasabah.add(nasabah);
    }

    public void tambahSetoran(Setoran setoran) {
        daftarSetoran.add(setoran);
    }

    public void tampilkanNasabah() {
        System.out.println("Daftar Nasabah: \n");

        for (Nasabah nasabah : daftarNasabah) {
            System.out.println("ID Nasabah: " + nasabah.getIdNasabah());
            System.out.println("Nama Nasabah: " + nasabah.getNamaNasabah());
            System.out.println("-----------------------------\n");

        }
    }

    public void tampilkanSetoran() {
        System.out.println("Daftar Setoran: \n");

        for (Setoran setoran : daftarSetoran) {
            System.out.println("ID Setoran: " + setoran.idSetoran);
            System.out.println("Tanggal Setoran: " + setoran.tanggalSetoran);
            System.out.println("Jumlah Setoran: " + setoran.getJumlah());
            System.out.println("Nasabah: " + setoran.getNasabah().getNamaNasabah());
            System.out.println("-----------------------------\n");
        }
    }
}
