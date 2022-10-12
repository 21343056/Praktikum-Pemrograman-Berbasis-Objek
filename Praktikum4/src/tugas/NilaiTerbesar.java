package tugas;

// Created by 21343056_MuhammadAsyrof

public class NilaiTerbesar {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c = 5;

        // keterangan value pada tiap variable
        System.out.println("Variable values...");
        System.out.println("Number 1 = "+a);
        System.out.println("Number 2 = "+b);
        System.out.println("Number 3 = "+c);

        // proses pencarian nilai terbesar
        int max = (a > b) ? (a > c) ? 10 : 23 : (b > c) ? 23 : 5;
        System.out.println("Nilai Tertingginya adalah = " +max);

    }
}
