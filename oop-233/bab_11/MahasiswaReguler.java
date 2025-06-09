package bab_11;

public class MahasiswaReguler extends Mahasiswa {
    @Override
    public void login() {
        System.out.println(this.nama + " Login pada portal " + this.prodi);
    }

    @Override
    public void cekNilai() {
        System.out.println(this.nama + " Mengecek nilai pada portal " + this.prodi);
    }

    @Override 
    public void cekAbsensi() {
        System.out.println(this.nama + " Mengecek nilai pada portal " + this.prodi);
    }
}
