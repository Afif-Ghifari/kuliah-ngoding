import java.util.Scanner;

public class UcapanTerimakasih_17 {
    
    // fungsi main
    public static void main(String[] args) {
        UcapanTerimakasih();

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ucapan tambahan: ");
        String tambahan = sc.next();
        UcapanTambahan(tambahan);
    }

    // fungsi
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan:");
        String namaOrang = sc.nextLine();

        return namaOrang;
    }
    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n" + 
        "You inspired in me a love for learning and made me feel like I could ask you anything");
    }
    
    public static String UcapanTambahan(String tambahan){
        return tambahan;
    }
}
