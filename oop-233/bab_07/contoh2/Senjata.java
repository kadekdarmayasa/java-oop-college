package bab_07.contoh2;

public class Senjata {
    String namaSenjata;
    int jumlahPeluru = 0;

    void setup(String nama, int jumlah) {
        namaSenjata = nama;
        jumlahPeluru = jumlah;
        System.out.println("Satu senjata " + namaSenjata + " diterima dengan " + jumlahPeluru + " peluru");
    }

    void cetakInfo() {
        System.out.println("\nInformasi senjata anda");
        System.out.println("Nama Senjata : " + namaSenjata);
        System.out.println("Jumlah Peluru : " + jumlahPeluru);
    }

    void cetakSisaPeluru() {
        System.out.println("Sisa peluru anda adalah " + jumlahPeluru);
    }

    void tembak() {
        jumlahPeluru--;
        System.out.println("\nSenjata ditembakan");
        cetakSisaPeluru();
    }

    void reload(int jumlah) {
        jumlahPeluru += jumlah;
        System.out.println("\nPeluru ditambah sejumlah " + jumlah);
        cetakSisaPeluru();
    }
}
