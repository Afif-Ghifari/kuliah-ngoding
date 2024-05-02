import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int Jumlah = sc.nextInt();

        Queue antri = new Queue(Jumlah);

        int pilih;

        do {
            menu();
            pilih = sc2.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("No rekening: ");
                    sc3.nextLine();
                    String norek = sc3.nextLine();
                    System.out.print("nama: ");
                    sc3.nextLine();
                    String nama = sc3.nextLine();
                    System.out.print("Alamat: ");
                    sc3.nextLine();
                    String alamat = sc3.nextLine();
                    System.out.print("Umur: ");
                    sc3.nextLine();
                    int umur = sc3.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc3.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                antri.peek();
                break;
                case 4:
                antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
