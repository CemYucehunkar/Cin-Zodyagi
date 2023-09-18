import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dogumTarihi;
        double mod;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Tarihinizi Giriniz : ");
        dogumTarihi = input.nextInt();

        mod = dogumTarihi % 12 ;
        if (dogumTarihi<0){
            System.out.print("Yanlış bir değer girdiniz.");
        }

        if (mod == 0) {
            System.out.print("Çin Zodyag Burcunuz: Maymun");
        } else if (mod == 1) {
            System.out.print("Çin Zodyag Burcunuz: Horoz");

        } else if (mod == 3) {
            System.out.print("Çin Zodyag Burcunuz: Köpek");

        } else if (mod == 4) {
            System.out.print("Çin Zodyag Burcunuz: Domuz");

        } else if (mod == 5) {
            System.out.print("Çin Zodyag Burcunuz: Öküz");

        } else if (mod == 6) {
            System.out.print("Çin Zodyag Burcunuz: Kaplan");

        } else if (mod == 7) {
            System.out.print("Çin Zodyag Burcunuz: Tavşan");

        } else if (mod == 8) {
            System.out.print("Çin Zodyag Burcunuz: Ejderha");

        } else if (mod == 9) {
            System.out.print("Çin Zodyag Burcunuz: Yılan");

        } else if (mod == 10) {
            System.out.print("Çin Zodyag Burcunuz: At");

        } else if (mod == 11) {
            System.out.print("Çin Zodyag Burcunuz: Koyun");


        }


    }
}