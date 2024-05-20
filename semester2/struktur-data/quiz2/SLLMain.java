import java.util.Scanner;

public class SLLMain {
    static SLL sll = new SLL();

    public static void main(String[] args) {
        SLL sll = new SLL();

        /* Tambah */
        sll.addFirst("RedBull", "Max Verstappen", "Sergio Perez");
        sll.addLast("Alpine Renault", "Esteban Ocon", "Pierre Gasly");
        sll.insertAt(2, "Ferrari", "Charles Leclerc", "Carlos Sainz");
        /* Tambah */

        sll.addLast("Mercedes", "Lewis Hamilton", "George Russel");
        sll.addLast("Mclaren Mercedes", "Lando Norris", "Oscar Piastri");
        sll.addLast("Aston Martin", "Fernando Alonso", "Lance Stroll");
        sll.addLast("RB Honda", "Yuki Tsunoda", "Daniel Ricciardo");
        sll.addLast("HAAS Ferrari", "Nico Hulkenberg", "Kevin Magnussen");
        sll.addLast("Kick Sauber", "Valtteri Bottas", "Zhou Guanyu");
        sll.addLast("Williams Mercedes", "Alexander Albon", "Logan Sargeant");

        /* Hapus */
        // sll.addFirst("Null", "Null", "Null");
        // sll.insertAt(2, "null", "null", "null");
        // sll.addLast("null", "null", "null");
        /* Hapus */

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);

        String races[] = { "qualifikasi", "1", "2", "3" };
        String tim, pembalap1, pembalap2;
        int position;

        boolean run = true;
        int quarter = 0;

        do {
            sll.sortPointDesc();
            System.out.println();
            System.out.println("Menu race " + races[quarter]);
            System.out.println("1. Tampilkan data tim");
            System.out.println("2. Tambah data");
            System.out.println("3. Tambah data di awal");
            System.out.println("4. Tambah data di akhir");
            System.out.println("5. Hapus data");
            System.out.println("6. Hapus data di awal");
            System.out.println("7. Hapus data di akhir");
            System.out.println("8. Race");
            System.out.println("9. Podium");
            System.out.println("10. Exit");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:

                    sll.printTeam();
                    break;
                case 2:

                    System.out.println("Tambah data:");

                    System.out.print("Tim: ");
                    tim = sc2.nextLine();

                    System.out.print("Pembalap 1: ");
                    pembalap1 = sc2.nextLine();

                    System.out.print("Pembalap 2: ");
                    pembalap2 = sc2.nextLine();

                    System.out.print("Posisi: ");
                    position = sc2.nextInt();
                    sll.insertAt(position, tim, pembalap1, pembalap2);

                    break;
                case 3:

                    System.out.println("Tambah data di awal:");
                    System.out.print("Tim: ");
                    tim = sc3.nextLine();

                    System.out.print("Pembalap 1: ");
                    pembalap1 = sc3.nextLine();

                    System.out.print("Pembalap 2: ");
                    pembalap2 = sc3.nextLine();

                    sll.addFirst(tim, pembalap1, pembalap2);

                    break;
                case 4:

                    System.out.println("Tambah data di akhir:");
                    System.out.print("Tim: ");
                    tim = sc4.nextLine();

                    System.out.print("Pembalap 1: ");
                    pembalap1 = sc4.nextLine();

                    System.out.print("Pembalap 2: ");
                    pembalap2 = sc4.nextLine();

                    sll.addLast(tim, pembalap1, pembalap2);

                    break;
                case 5:

                    System.out.println("Hapus data:");

                    System.out.print("Posisi: ");
                    position = sc.nextInt();

                    sll.remove(position);
                    break;

                case 6:
                    System.out.println("Hapus data di awal");
                    sll.removeFirst();

                    break;
                case 7:

                    System.out.println("Hapus data di akhir");
                    sll.removeLast();

                    break;
                case 8:
                    if (quarter == 0) {
                        sll.qualifikasi();
                        quarter++;
                    } else {
                        sll.startRace();
                        quarter++;
                    }
                    break;
                case 9:
                    sll.printPodium();
                    break;

                case 10:
                    run = !run;
                    break;

                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (run || quarter == 3);
    }
}
