import java.util.Scanner;

public class tugas1 {
    // fungsi
    static int DescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            return DescendingRekursif(n - 1);
        } else {
            return 0;
        }
    }

    static int DescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        return 0;
    }

    // fungsi main
    public static void main(String[] args) {
        // deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int angka;

        // intput nilai
        System.out.print("Masukkan angka: ");
        angka = sc.nextInt();

        // output
        System.out.print("Fungsi rekursif: ");
        DescendingRekursif(angka);
        System.out.println();
        System.out.print("Fungsi iteratif: ");
        DescendingIteratif(angka);
    }
}
