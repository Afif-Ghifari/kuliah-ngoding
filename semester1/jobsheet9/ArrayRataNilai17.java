import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        // deklarasi variabel
        Scanner sc =  new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        // input nilai
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // proses
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;

        // output program
        System.out.println("Rata-rata nilai = "+rata2);
    }
}
