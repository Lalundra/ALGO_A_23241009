import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
        int nilai_angka;
    Scanner input = new Scanner (System.in);
    System.out.print("Masukan hasil ujian anda:");
    nilai_angka = input.nextInt();
    String predikat ="null";

    if (nilai_angka >80){
        predikat = "A Sangat Baik";
    }else if (nilai_angka >=70 && nilai_angka <=79){
        predikat = "B Cukup baik";
    }if (nilai_angka >=60 && nilai_angka <=69){
        predikat = "C Tingkatkan nilai anda!";
    }else if (nilai_angka >=50 && nilai_angka <=59){
        predikat = "D Tolonglah belajar lebih giat lagi!";
    }else if (nilai_angka <50){
        predikat = "E Tidak Lulus";
    }if (nilai_angka>100){
        System.out.println("!!!!Nilai yang dimasukan terlalu besar!!!!");
        predikat = "error";
    }else if (nilai_angka <0)
        System.out.println("!!!Nilai yang dimasukan tidak valid!!!!");
        predikat = "error";

        System.out.println("=======================");
        System.out.println("Nilai ujian yang dimasukan:" + nilai_angka);
        System.out.println("Anda mendapatkan nilai: " + predikat);
       
}
}
