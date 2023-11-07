import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        // perulangan
        for (int iOuter = 1; iOuter <=N; iOuter++) {
            for (int i = 0; i <= N; i++) {
                System.out.print("*");
            }
        }
    }
}
