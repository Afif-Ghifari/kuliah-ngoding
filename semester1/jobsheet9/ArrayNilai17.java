import java.util.Scanner;

public class ArrayNilai17 {
    public static void main(String[] args) {
        // deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        // input nilai
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // output program
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70 ) {
                System.out.println("Mahasiswa ke-"+i+" lulus");
            } else {
                System.out.println("Mahasiswa ke-"+i+" tidak lulus");
            }
        }
    }
}
