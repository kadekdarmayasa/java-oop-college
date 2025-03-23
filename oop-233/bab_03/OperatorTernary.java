package bab_03;

public class OperatorTernary {
    public static void main(String[] args) {
        boolean suka = true;
        String jawaban;
        // menggunakan operator ternary
        jawaban = (suka == true) ? "iya" : "tidak";

        // menampilkan jawaban
        System.out.println("Apakah kamu suka aku?");
        System.out.println("Jawaban : " + jawaban);
    }
}
