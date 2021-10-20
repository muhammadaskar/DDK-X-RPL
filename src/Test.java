import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // double pi = Math.PI;

        String judulBuku, pengarang, penerbit, tahunTerbit;
        System.out.print("masukkan judul : ");
        judulBuku = input.nextLine();
        System.out.print("masukkan pengarang : ");
        pengarang = input.nextLine();
        System.out.print("masukkan penerbit : ");
        penerbit = input.nextLine();
        System.out.print("masukkan tahun terbit : ");
        tahunTerbit = input.nextLine();
        System.out.println("------------------------------");
        System.out.println("Judul Buku    : " + judulBuku);
        System.out.println("Pengarang     : " + pengarang);
        System.out.println("Penerbit      : " + penerbit);
        System.out.println("Tahun Terbit  : " + tahunTerbit);

    }
}
