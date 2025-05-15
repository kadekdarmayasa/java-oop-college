package bab_08;

class Hewan {
    public String nama;
    public String jenis;

    // Constructor
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void Suara() {
        System.out.println(this.nama + " mengeluarkan suara");
    }
}

class Kucing extends Hewan {
    // Constructor
    public Kucing(String nama, String jenis) {
        super(nama, jenis);
    }

    public void Lari() {
        System.out.println(this.nama + " sedang berlari");
    }
}


class Unggas extends Hewan {
    protected String keluarga;

    // Constructor
    public Unggas(String nama, String jenis, String keluarga) {
        super(nama, jenis);
        this.keluarga = keluarga;
    }

    public String getKeluarga() {
        return keluarga;
    }

    public void setKeluarga(String keluarga) {
        this.keluarga = keluarga;
    }
}

class Burung extends Unggas {
    // Constructor
    public Burung(String nama, String jenis, String keluarga) {
        super(nama, jenis, keluarga);
    }

    public void Terbang() {
        System.out.println(this.nama + " sedang terbang");
    }
}


public class Latihan81 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Pupus", "Anggora");
        Burung burung = new Burung("Pipit", "Passeridae", "Aves");
        
        System.out.println("Nama: " + kucing.nama);
        System.out.println("Jenis: " + kucing.jenis);
        kucing.Suara();
        kucing.Lari();

        System.out.print("\n");
        
        System.out.println("Nama: " + burung.nama);
        System.out.println("Jenis: " + burung.jenis);
        System.out.println("Keluarga: " + burung.keluarga);
        burung.Suara();
        burung.Terbang();
    }   
}
