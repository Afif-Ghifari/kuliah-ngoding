import java.util.Scanner;

public class tugas2 {
    // deklarasi variabel global
    static Scanner sc = new Scanner(System.in);
    static int nilai[][];
    static String nama[] = { "sari", "rina", "yani", "dwi", "lusi" };

    // fungsi main
    public static void main(String[] args) {

        modifikasi();
        System.out.println();
        isiArray(nilai);
        System.out.println();
        tampilArray(nilai, nama);
        System.out.println();
        System.out.println("Nilai tertinggi adalah: " + nilaiTertinggi(nilai));
        System.out.println();
        nilaiMhsTertinggi(nilai, nama);
    }

    // fungsi
    public static void modifikasi() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int pjgBaris = sc.nextInt();
        System.out.print("Masukkan jumlah minggu: ");
        int pjgKolom = sc.nextInt();
        nilai = new int[pjgBaris][pjgKolom];


    }

    public static void isiArray(int[][] arr) {

        for (int mahasiswa = 0; mahasiswa < nilai.length; mahasiswa++) {
            for (int minggu = 0; minggu < arr[mahasiswa].length; minggu++) {
                System.out.print("Input nilai array: ");
                arr[mahasiswa][minggu] = sc.nextInt();
            }
        }
    }

    public static void tampilArray(int[][] arr, String[] arr2) {
        for (int mahasiswa = 0; mahasiswa < nilai.length; mahasiswa++) {
            System.out.println("\n" + arr2[mahasiswa]);
            for (int minggu = 0, j = 1; minggu < arr[mahasiswa].length; minggu++, j++) {
                System.out.println("Minggu ke-" + j + " : " + arr[mahasiswa][minggu]);
            }
        }
    }

    public static int nilaiTertinggi(int[][] arr) {
        int nilaiTop = arr[0][0];

        for (int mahasiswa = 0; mahasiswa < nilai.length; mahasiswa++) {
            for (int minggu = 0; minggu < arr[mahasiswa].length; minggu++) {
                if (nilaiTop < arr[mahasiswa][minggu]) {
                    nilaiTop = arr[mahasiswa][minggu];
                }
            }
        }

        return nilaiTop;
    }

    public static void nilaiMhsTertinggi(int[][] arr, String[] arr2) {
        String namaMhs = null;
        int nilaiTop = nilaiTertinggi(nilai),
                mingguKe = 1;
        for (int mahasiswa = 0; mahasiswa < nilai.length; mahasiswa++) {
            for (int minggu = 0; minggu < arr[mahasiswa].length; minggu++) {
                if (nilaiTop == arr[mahasiswa][minggu]) {
                    namaMhs = arr2[mahasiswa];
                    mingguKe += minggu;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah: " + namaMhs);
        System.out.println("dengan nilai: " + nilaiTop);
        System.out.println("Pada minggu ke-" + mingguKe);
    }
}
