package bab_03;

public class OperatorBitwise {
    public static void main(String[] args) {
        int a = 35;
        int b = 18;
        int c = 0;

        c = a & b; // AND
        System.out.println("a & b = " + c);
        
        c = a | b; // OR
        System.out.println("a | b = " + c);

        c = a ^ b; // XOR
        System.out.println("a ^ b = " + c);

        c = ~a; // Negasi
        System.out.println("~a = " + c);

        c = a << 2; // Left Shift
        System.out.println("a << 2 = " + c);

        c = a >> 2; // Right Shift
        System.out.println("a >> 2 = " + c);

        c = a >>> 2; // Right Shift (unsigned)
        System.out.println("a >>> 2 = " + c);
    }
}
