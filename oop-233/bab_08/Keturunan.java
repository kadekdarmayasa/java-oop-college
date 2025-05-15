package bab_08;

class OrangTua {
    String namaOrangTua;

    // Konstruktor class OrangTua
    public OrangTua(String namaOrtu) {
        this.namaOrangTua = namaOrtu;
    }
}

class Anak extends OrangTua {
    // Konstruktor class Anak
    public Anak(String namaOrtu) {
        super(namaOrtu); 
    }

    public void menangis() {
        System.out.println("Ouwekkk... Ouwekkk...");
    }
}

public class Keturunan {
    public static void main(String[] args) {
        // Pembentukan objek class Anak
        Anak budi = new Anak("Bayu");
        budi.menangis();
    }
}
