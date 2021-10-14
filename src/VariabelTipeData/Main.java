package VariabelTipeData;

public class Main {
    public static void main(String[] args) {
        String nama;    //  variabel nama dengan menggunakan tipe data String(karakter/huruf)
        int umur;       //  variabel umur dengan menggunakan tipe data int(bilangan bulat)
        float tinggi;   //  variabel tinggi dengan menggunakan tipe data float(bilangan desiman)
        char jenisKelamin;

        nama = "Cahyo";         //  variabel nama dengan nilai Cahyo
        umur = 25;              //  variabel umur dengan nilai 25
        tinggi = (float) 165.2; // variabel tinggi dengan nilai 165.2
        jenisKelamin = 'L'; // L adalah laki laki

        System.out.println("Nama : " +nama);
        System.out.println("Umur : " +umur);
        System.out.println("Tinggi : " +tinggi);
        System.out.println("Jenis Kelamin : "+jenisKelamin);


    }
}
