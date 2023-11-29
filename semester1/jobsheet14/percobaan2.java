import java.util.Scanner;

public class percobaan2 {
    // fungsi
    static int hitungPangkat(int x, int y) {
        int hasil;
        if (y == 0) {
            System.out.print("1 = ");
            return 1;
        } else {
            System.out.print(x + " x ");
            hasil = x * hitungPangkat(x, y - 1);
            return hasil;
        }
    }

    // fungsi main
    public static void main(String[] args) {
        // deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        // input nilai
        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        // output
        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
