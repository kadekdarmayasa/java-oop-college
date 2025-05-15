package bab_08;

class Parent {
    public int x = 5;
}

class Child extends Parent {
    public int x = 10;

    public void cetak(int x) {
        System.out.println("Nilai parameter X = " + x);
        System.out.println("Nilai x pada class Child = " + this.x);
        System.out.println("Nilai x pada class Parent = " + super.x);
    }
}

public class Contoh2CetakNilai {
    public static void main(String[] args) {
        Child child = new Child();
        child.cetak(15);
    }
}
