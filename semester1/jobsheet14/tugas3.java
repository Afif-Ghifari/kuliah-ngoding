import java.util.Scanner;

public class tugas3 {
    // fungsi
    static int CekPrimaRekursif(int x, int y) {
        if (x <= 1) {
            return (0);
        } else if (y == 1) {
            return (1);
        } else {
            if (x % y == 0) {
                return (0);
            } else {
                return (CekPrimaRekursif(x, y - 1));
            }
        }
    }

    // fungsi main
    public static void main(String[] args) {
        // deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int angka, hasil;

        // Input nilai
        System.out.print("Masukkan angka: ");
        angka = sc.nextInt();

        hasil = CekPrimaRekursif(angka, angka / 2);

        // output
        if (hasil == 1) {
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " adalah bukan bilangan prima");
        }
    }
}
