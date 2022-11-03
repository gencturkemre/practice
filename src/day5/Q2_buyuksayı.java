package day5;

import java.util.Scanner;

public class Q2_buyuksayı {
    static int enbuyuksayı;

    public static void main(String[] args) {

        // Kullanıcıdan 4 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("sayı 1 giriniz:");
        int sayı1 = scan.nextInt();

        System.out.print("sayı 2 giriniz:");
        int sayı2 = scan.nextInt();

        System.out.print("sayı 3 giriniz:");
        int sayı3 = scan.nextInt();

        System.out.print("sayı 4 giriniz:");
        int sayı4 = scan.nextInt();



        if (sayı1 > sayı2) {
            int enbuyuksayı = sayı1;

        } else if (sayı2 > sayı3) {
            int enbuyuksayı = sayı2;

        } else if (sayı3 > sayı4) {
            int enbuyuksayı = sayı3;

        } else if (sayı4 > sayı1) {
            int enbuyuksayı = sayı4;

        }
        System.out.println(enbuyuksayı);
        }

    }






