import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        // Deklarasi variabel dan input nilai
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();

        // proses perulangan
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
