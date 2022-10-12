package latihan;

// Created by 21343056_MuhammadAsyrof

public class AritmatikaDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        double x = 27.475;
        double y = 7.22;

        System.out.println("Variable values...");
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("x = "+x);
        System.out.println("y = "+y);

        // penjumlahan angka
        System.out.println("adding...");
        System.out.println("i + j = " + ( i + j ));
        System.out.println("x + y = " + ( x + y ));

        // pengurangan angka
        System.out.println("subtracting...");
        System.out.println("i - j = " + ( i - j ));
        System.out.println("x - y = " + ( x - y ));

        // pembagian angka
        System.out.println("Multiplying...");
        System.out.println("i / j = " + ((float) i / j ));
        System.out.println("x / y = " + ( x / y ));
        
        // menghitung hasil modulus dari pemabgian
        System.out.println("Computing the remainder...");
        System.out.println("i % j = " + ( i % j ));
        System.out.println("x % y = " + ( x % y ));
        
        // tipe penggabungan
        System.out.println("Mixing types...");
        System.out.println("j + y = " + ( j + y ));
        System.out.println("i + x = " + ( i + x ));
    }
}
