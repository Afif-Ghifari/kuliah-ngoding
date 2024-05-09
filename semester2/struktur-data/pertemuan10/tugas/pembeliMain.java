import java.util.Scanner;

public class pembeliMain {
    public static void menu(){
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Cek Antrian terdepan");
        System.out.println("3. Cek Antrian terbelakang");
        System.out.println("4. Cari Pembeli berdasarkan Nama");
        System.out.println("5. Tampilkan seluruh data");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        queue antri = new queue(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    int noHP = sc.nextInt();
                    pembeli pb = new pembeli(nama, noHP);
                    sc.nextLine();
                    antri.enqueue(pb);
                    break;
                case 2:
                    antri.peek();
                    break;
                case 3:
                    antri.peekRear();
                    break;
                case 4:
                    System.out.print("Cari Nama Pembeli: ");
                    String cari = sc.nextLine();
                    int pos = antri.peekPosition(cari);
                    break;
                case 5:
                    antri.daftarPembeli();
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}