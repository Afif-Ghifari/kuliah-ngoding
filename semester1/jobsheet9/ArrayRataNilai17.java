import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        // deklarasi variabel
        Scanner sc =  new Scanner(System.in);
        double totalLulus = 0,
               totalTidakLulus = 0,
               rata2Lulus = 0, 
               rata2TidakLulus = 0,
               jmlLulus = 0,
               jmlTidakLulus = 0 ;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int panjangArray = sc.nextInt();
        int[] nilaiMhs = new int[panjangArray];

        // input nilai
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // proses
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } 
            else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }
        rata2Lulus = totalLulus/jmlLulus;
        rata2TidakLulus = totalTidakLulus/jmlTidakLulus;
        
        // output program
        System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2TidakLulus);
    }
}
