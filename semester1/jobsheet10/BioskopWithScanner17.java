import java.util.Scanner;
public class BioskopWithScanner17 {
    public static void main(String[] args) {

        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int baris, kolom, choose;
        String nama,next;
        String[][] penonton = new String[4][2];

        // Proses pemilihan
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih opsi: ");
        choose = sc.nextInt();

        switch (choose) {
            case 1:
            // Proses perulangan
            while (true) {
                System.out.print("Masukkan nama: ");
                nama = sc.next();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
    
                // Proses
                if (penonton[baris-1][kolom-1] == null) {
                    penonton[baris-1][kolom-1] = nama;
                } else {
                    System.out.println("Kursi sudah dipakai");
                }

                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
    
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            };
            case 2:
            // Output 
            System.out.println("Daftar penonton:");
            for (int i = 0; i < penonton.length; i++) {
                if (penonton[i][0] != null) {
                    System.out.println("Kursi baris "+(i+1)+" kolom 1 diisi: "+penonton[i][0]);
                } else {
                    System.out.println("Kursi baris "+(i+1)+" kolom 1 diisi: ***");
                }
            }
            for (int i = 0; i < penonton.length; i++) {
                if (penonton[i][1] != null) {
                    System.out.println("Kursi baris "+(i+1)+" kolom 2 diisi: "+penonton[i][1]);
                } else {
                    System.out.println("Kursi baris "+(i+1)+" kolom 2 diisi: ***");
                }
            }
            default:
                break;
        }
    }
}
