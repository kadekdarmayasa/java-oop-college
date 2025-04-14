package bab_07;

class Buah {
    String namaBuah;
    String warnaBuah;
    String rasaBuah;

    public Buah(String nama, String warna, String rasa) {
        namaBuah = nama;
        warnaBuah = warna;
        rasaBuah = rasa;
    }

    void infoBuah() {
        System.out.println("Informasi Buah:");
        System.out.println("Nama : " + namaBuah);
        System.out.print("Warna : " + warnaBuah);
        System.out.println("Rasa : " + rasaBuah);
    }

    void infoWarna() {
        System.out.println("Warna buah " + namaBuah + " adalah " + warnaBuah);
    }

    void infoRasa() {
        System.out.println(namaBuah + " rasanya " + rasaBuah);
    }
}

public class Latihan72 {
    public static void main(String[] args) {
        Buah pisang = new Buah("Pisang", "Kuning", "Manis");
        
        pisang.infoBuah();
        pisang.infoWarna();
        pisang.infoRasa();
    }
}
