import java.util.Scanner;

public class WhileGaji17 {
    public static void main(String[] args) {
    
        // Deklarasi variabel
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double  gajiLembur = 0,
                totalGajiLembur = 0;
        String jabatan;

        // Input nilai
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();

        // Proses perulangan
        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan Karyawan ke-" + (i+1) +": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lebur: ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumlahJamLembur * 100000;  
            } else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
        }

        // Output
        System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}
