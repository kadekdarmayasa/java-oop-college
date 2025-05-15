package bab_08;

class Pegawai {
    public String nama;
    public int tanggungan;
    public double gaji;
}

class Manager extends Pegawai {
    String departemen;

    public void isiData(String nm, String dpt) {
        nama = nm;
        departemen = dpt;
    }
}

public class Contoh1Inheritance {
    public static void main(String[] args) {
        Manager agus = new Manager();
        agus.isiData("Agus", "Pemasaran");
        System.out.println("Nama: " + agus.nama);
        System.out.println("Departemen: " + agus.departemen);
    }
}
