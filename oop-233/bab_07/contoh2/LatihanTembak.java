package bab_07.contoh2;

public class LatihanTembak {
    public static void main(String[] args) {
        // Membuat objek senjata
        Senjata pistol = new Senjata();

        // Setup senjata
        pistol.setup("Berreta M92F", 10);

        // Tampilkan info senjata
        pistol.cetakInfo();
        // Tembahakan senjata
        pistol.tembak();

        // Reload senjata
        pistol.reload(10);
    }
}
