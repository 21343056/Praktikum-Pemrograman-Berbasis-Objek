package latihan;

// Created by 21343056_MuhammadAsyrof

public class KondisiOperator {
    public static void main(String[] args) {
        String status = "";
        int grade = 50;

        // menddapatkan status pelajar
        status = (grade >= 60) ?"Passed" : "Fall";

        // print status
        System.out.println(status);

    }
}
