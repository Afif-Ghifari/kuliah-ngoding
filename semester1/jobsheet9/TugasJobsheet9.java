import java.util.Scanner;

public class TugasJobsheet9 {
    public static void main(String[] args) {

        // beklarasi variabel
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int jmlElemen = sc.nextInt();
        int[] nilai = new int[jmlElemen];

        // input variabel
        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan elemen ke-"+(i+1)+" : ");
            nilai[i] = sc.nextInt();
        }

        int nilaiTinggi = nilai[0],
            nilaiRendah = nilai[0],
            rata2 = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > nilaiTinggi) {
                nilaiTinggi = nilai[i];
            }
            if (nilai[i] < nilaiRendah) {
                nilaiRendah = nilai[i];
            }
            rata2 += nilai[i];
        }
        double rata = rata2/nilai.length;

        System.out.println("Nilai tertinggi: " + nilaiTinggi);
        System.out.println("Nilai terendah: " + nilaiRendah);
        System.out.println("Rata-rata: " + rata);
    }

}
