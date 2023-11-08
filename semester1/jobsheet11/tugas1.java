import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        // deklarasi variabel
        Scanner sc = new Scanner(System.in);

        // input nilai
        System.out.print("Masukkan nilai: ");
        int N = sc.nextInt();

        // proses perulangan
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
