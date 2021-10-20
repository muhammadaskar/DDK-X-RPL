package Operator;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        int angka1, angka2, hasil;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka 1 = ");
        angka1 = input.nextInt();

        System.out.print("Masukkan angka 2 = ");
        angka2 = input.nextInt();

        hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);

    }

}
