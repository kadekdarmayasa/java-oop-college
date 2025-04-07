package bab_06;

public class Latihan63 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Penggunaan: java Latihan3OperasiAritmatika <angka1> <angka2>");
            System.out.println("Contoh: java Latihan3OperasiAritmatika 5 4");
            return;
        }
        
        try {
            int angka1 = Integer.parseInt(args[0]);
            int angka2 = Integer.parseInt(args[1]);
            
            System.out.println("Operasi Aritmatika dengan parameter");
            System.out.println("==================================");
            System.out.println("Angka pertama: " + angka1);
            System.out.println("Angka kedua: " + angka2);
            System.out.println("Hasil penjumlahan: " + (angka1 + angka2));
            System.out.println("Hasil pengurangan: " + (angka1 - angka2));
            System.out.println("Hasil perkalian: " + (angka1 * angka2));
            
            if (angka2 != 0) {
                System.out.println("Hasil pembagian: " + ((double) angka1 / angka2));
            } else {
                System.out.println("Pembagian tidak dapat dilakukan (pembagi = 0)");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Parameter harus berupa angka!");
        }
    }
}
