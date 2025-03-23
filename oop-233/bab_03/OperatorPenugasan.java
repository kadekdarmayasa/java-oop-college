package bab_03;

public class OperatorPenugasan {
    public static void main(String[] args) {
        // Deklarasi Variabel
        int angka1, angka2;

        // Pengisian Nilai
        angka1 = 5;
        angka2 = 10;

        // Menampilkan isi variabel
        System.out.println("Angka1 = " + angka1);
        System.out.println("Angka2 = " + angka2);

        // Pengisian dan penambahan 
        angka2 += angka1;
        // sekarang angka2  = 15
        System.out.println("Penambahan : " + angka2);

        // Pengisian dan pengurangan 
        angka2 -= angka1;
        // sekarang angka2 = 10
        System.out.println("Pengurangan : " + angka2);
    }
}
