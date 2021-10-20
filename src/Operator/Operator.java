package Operator;

public class Operator {
    public static void main(String[] args) {
        int nilaiA = 50;
        int nilaiB = 10;
        final int nilaiC = 20;
        double nilaiD = 42.5;
        nilaiA = 30;
        nilaiB = 70;

        /* Operator Penjumlahan
        int hasil = nilaiA + nilaiB + nilaiC;
        System.out.println(hasil);

        hasil += 100;  // hasil = hasil + 100
        System.out.println("Hasil Terbaru = "+hasil);
        */

        /* Operator pengurangan
        int hasil = nilaiB - nilaiA; // 70 - 30
        System.out.println("Hasil = "+hasil);
         */

        /* Perkalian
        int hasil = (int) (nilaiB * nilaiD);
        System.out.println(hasil);
         */

        /* pembagian
        double hasil = nilaiB / nilaiA;
        System.out.println("hasil bagi dari " +nilaiB +" / " +nilaiA +" = " +hasil);
         */

        /* Penggunaan operator logika
        int nilaiE = 10;
//        System.out.println( nilaiE > 5 && nilaiE < 15 ); // true
        System.out.println( nilaiE > 6 || nilaiE < 9 );
        */
    }
}
