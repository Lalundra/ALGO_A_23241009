import java.util.Scanner;

public class App {
    public static void main(String[] args){

    int tot_Belanja;

    Scanner input = new Scanner (System.in);
    
    System.out.print("Masukan total belanjaan anda disisni: ");
    tot_Belanja = input.nextInt();

    String output;

    if (tot_Belanja >=50.000){
       output = "!!!! Selamat anda mendapatkan MOUSE laptop !!!!!";
    }
    else {
       output ="Mohon maaf anda kurang beruntung untuk mendapatkan MOUSE :(";
    }
    System.out.println("HASIL");
    System.out.println("=============");
    System.out.println("output :" + output);
}
}
