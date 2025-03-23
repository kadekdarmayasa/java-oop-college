package bab_03;

public class OperatorLogika {
    public static void main(String[] args) {
        boolean pertanyaan1 = true;
        boolean pertanyaan2 = false;
        boolean x;

        // Konjungsi (dan)
        x = pertanyaan1 && pertanyaan2;
        System.out.println("true AND false? : " + x);

        // Disjungsi (atau)
        x = pertanyaan1 || pertanyaan2;
        System.out.println("true OR false? : " + x);

        // Negasi (bukan)
        x = !pertanyaan2;
        System.out.println("negasi dari false? : " + x);
    }
}
