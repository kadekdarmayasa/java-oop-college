package PertemuanSepuluh;

public class Mahasiswa {
    public String nama;
    public String nim;
    public String prodi;
    public String angkatan;

    public void login() {
        System.out.println("Login " + this.nama);
    }

    public void cekJadwalKuliah() {
        System.out.println("Jadwal Kuliah");
    }

    public void cekNilai() {
        System.out.println("Nilai Mahasiswa");
    }
}
