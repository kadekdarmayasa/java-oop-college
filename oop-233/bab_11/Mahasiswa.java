package bab_11;

/**
 * Abstraction
 * 
 * Proses untuk memproteksi class maupun informasi class agar tidak disalahgunakan
 * Contoh: 
 * 1. Pada saat membuat object dari suatu class.
 * 2. Pada method dalam implementasi konsep poewarisan
 *    -> Method overriding
 *    -> Method pada class parent tidak memiliki body
 *    -> Proses (body) ditulis pada class child
 *    -> Method abstract hanya bisa didefinisikan pada class abstract
 */

public abstract class Mahasiswa {
    public String nim;
    public String nama;
    public String prodi;
    public String angkatan;

    public abstract void login();

    public abstract void cekNilai();

    public abstract void cekAbsensi();
}