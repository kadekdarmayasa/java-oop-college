package PertemuanSepuluh;

public class Main {
    public static void main(String[] args) {
        Mahasiswa tono = new MahasiswaReguler();
        Mahasiswa budi = new MahasiswaReguler();
        Mahasiswa joni = new MahasiswaReguler();

        tono.nama = "Tono";
        budi.nama = "Budi";
        joni.nama = "Joni";

        tono.login();
        budi.login();
        joni.login();
    }    
}
