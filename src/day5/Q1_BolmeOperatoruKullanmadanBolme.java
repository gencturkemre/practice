package day5;

import java.util.Scanner;

public class Q1_BolmeOperatoruKullanmadanBolme {
    public static void main(String[] args) {

        //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        //kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 2 sayı gir");
        int bolunen=scan.nextInt();
        int bolen=scan.nextInt();



        for (int i = bolen; bolen >= bolunen;   ) {

            int bolum;
            bolum = bolunen - bolen;

            System.out.println(bolum);


        }


    }
}
