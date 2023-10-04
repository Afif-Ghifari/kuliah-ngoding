import java.util.Scanner;

public class Pemilihan2Percobaan317 {
    public static void main(String[] args) {
        
        // Deklarasi variabel
        Scanner input17 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        // Input nilai
        System.out.print("Masukkan kategori \t\t: ");
        kategori = input17.nextLine();
        System.out.print("Masukkan besarnya penghasilan \t: ");
        penghasilan = input17.nextInt();

        // Pemilihan dan proses
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.02;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan bersih  \t\t: " +gajiBersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan bersih  \t\t: " +gajiBersih);
        } else{
            System.out.println("Masukan kategori salah");
        }
    }
}
