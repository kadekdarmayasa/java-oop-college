package bab_12;

import bab_12.interfaces.InterfaceMahasiswa;
import bab_12.interfaces.InterfaceKP;

public class MahasiswaReguler extends Mahasiswa implements InterfaceMahasiswa, InterfaceKP {
    @Override
    public void login() {
        System.out.println("Mahasiswa Reguler login");
    }

    @Override
    public void cekNilai() {
        System.out.println("Mahasiswa Reguler cek nilai");
    }

    @Override
    public void cekAbsensi() {
        System.out.println("Mahasiswa Reguler cek absensi");
    }

    @Override
    public void mendaftarKP() {
        System.out.println("Mahasiswa Reguler mendaftar KP");
    }
}
