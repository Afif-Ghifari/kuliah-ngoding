import java.util.Scanner;

public class tugas2 {
    // fungsi
    static int PenjumlahanRekursif(int x) {
        if (x == 1) {
            System.out.print(" 1");
            return 1;
        } else {
            int n = x + PenjumlahanRekursif(x - 1);
            System.out.print(" + " + x);
            return n;
        }
    }

    // fungsi main
    public static void main(String[] args) {
        // deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int f;

        // input nilai
        System.out.print("Masukkan angka: ");
        f = sc.nextInt();

        // output
        System.out.println(" = " + PenjumlahanRekursif(f));
    }
}
