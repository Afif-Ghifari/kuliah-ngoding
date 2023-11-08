import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        // deklrasi variabel dan input nilai
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N(minimal 3) : ");
        int N = sc.nextInt();

        // proses perulangan
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i  == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
