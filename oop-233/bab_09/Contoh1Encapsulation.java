package bab_09;

class Mahasiswa {
    // Deklarasi variabel private
    private String NIM;
    private String nama;

    // Method setter untuk variabel NIM
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    // Method getter untuk variabel NIM
    public String getNIM() {
        return this.NIM;
    }

    // Method setter untuk variabel nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method getter untuk variabel nama
    public String getNama() {
        return this.nama;
    }
}

public class Contoh1Encapsulation {
    public static void main(String[] args) {
        // Deklarasi objek u/ kelas Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        // Memberi data melalui setter
        mhs1.setNIM("170030001");
        mhs1.setNama("Agus");
        mhs2.setNIM("170030002");
        mhs2.setNama("Bayu");

        // Mengambil data melalui getter
        System.out.println("NIM mahasiswa ke-1 adalah : " + mhs1.getNIM());
        System.out.println("Nama mahasiswa ke-1 adalah : " + mhs1.getNama());
        System.out.println("NIM mahasiswa ke-2 adalah : " + mhs2.getNIM());
        System.out.println("Nama mahasiswa ke-2 adalah : " + mhs2.getNama());
    }
}