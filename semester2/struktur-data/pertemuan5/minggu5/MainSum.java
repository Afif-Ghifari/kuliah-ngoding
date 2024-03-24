import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("Program menghitung keuntungan total (satuan juta, misal 5.9)");
        
        System.out.print("Masukkan jumlah bulan: ");
        int elm = sc.nextInt();

        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlPerusahaan = sc.nextInt();
        Sum[] sm = new Sum[jmlPerusahaan];

        System.out.println("=======================================");
        for (int i = 0; i < jmlPerusahaan; i++) {
            sm[i] = new Sum(elm);
            System.out.println("Perusahaan " + (i + 1));
            for (int j = 0; j < elm; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < jmlPerusahaan; i++) {   
            System.out.println("=======================================");
            System.out.println("Algoritma brute force");
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan));
        }
        for (int i = 0; i < jmlPerusahaan; i++) {   
            System.out.println("=======================================");
            System.out.println("Algoritma divide conquer");
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
        }
    }
}
