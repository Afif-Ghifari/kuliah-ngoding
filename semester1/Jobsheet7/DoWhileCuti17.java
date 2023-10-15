import java.util.Scanner;

public class DoWhileCuti17 {
    public static void main(String[] args) {
        
        // Deklarasi variabel
        Scanner sc = new Scanner(System.in); 
        int jatahCuti, jumlahHari;
        String konfirmasi;

        // Input variabel
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        // Proses perulangan
        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();
                
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    continue;
                }
            } else{
                System.out.println("Terima kasih telah memakai program ini");
                break;
            }
        } while (jatahCuti > 0);
    }    
}
