package basic_practice;

import java.util.Scanner;

public class Q5_KelimeninOrtasiniYazdirma {
         /*
 tek sayida harf iceren bir String degiskenin ortasindaki harfi
 konsolda yazdirmak icin bir Java programi yaziniz.
 Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdirin
 ORNEK:
       INPUT  :  Python
       OUTPUT :  th
 */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String input = scan.next();

        System.out.println( ortadakiHarfiYazdir(input));
    }

    public static String ortadakiHarfiYazdir(String input) {

        int uzunluk = input.length();
        int ortadakiIndex=uzunluk/2;
        int baslangıçIndex=ortadakiIndex-1;
        int bitişIndex=ortadakiIndex+1;
        if (uzunluk==0) return"girilen format yanlış";
        else if (uzunluk%2==0)
            return input.substring(baslangıçIndex,bitişIndex);

        else return input.substring(ortadakiIndex,ortadakiIndex+1);



    }

}
