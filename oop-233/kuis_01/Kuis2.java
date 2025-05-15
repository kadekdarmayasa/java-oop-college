package kuis_01;

class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public String predikat() {
        if (ipk >= 3.50) {
            return "Cumlaude";
        } else if (ipk >= 3.00) {
            return "Sangat Baik";
        } else  {
            return "Perlu Perbaikan";
        }
    }
}

public class Kuis2 {
    public static void main(String[] args) {
        // 5 mahasiswa dan tampilkkan output nama dan predikat
        Mahasiswa[] mahasiswa = new Mahasiswa[5];
        mahasiswa[0] = new Mahasiswa("Sugiarta", "123456789", 3.75);
        mahasiswa[1] = new Mahasiswa("Diah Ayu", "987654321", 3.25);
        mahasiswa[2] = new Mahasiswa("Rama Dwipa", "456789123", 2.85);
        mahasiswa[3] = new Mahasiswa("Pramust Ditya", "321654987", 3.90);
        mahasiswa[4] = new Mahasiswa("Panji", "654321789", 2.95);

        for(Mahasiswa mhs: mahasiswa) {
            System.out.println("Nama    : " + mhs.nama);
            System.out.println("Predikat: " + mhs.predikat());
            System.out.println();
        }
    }
}
