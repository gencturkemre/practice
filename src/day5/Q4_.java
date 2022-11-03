package day5;

public class Q4_ {

        public static void main(String[] args) {
            //Bir top belirli yükseklikten atılmaktadır.
            // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
            // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
            // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

            double yukseklik = 120;

            topuZiplat(yukseklik);
        }

        private static void topuZiplat(double yukseklik) {
            double topunToplamYolu = 0;
            int yereVurnaSayisi = 0;
            do {
                yereVurnaSayisi++;
                topunToplamYolu += yukseklik;
                yukseklik *= 0.75;
                topunToplamYolu += yukseklik;


            } while (yukseklik >= 100);
            System.out.println(" topun yere vurma sayisi : " + yereVurnaSayisi +
                    " \ntopun aldığı toplam yol: " +topunToplamYolu );
        }
    }



