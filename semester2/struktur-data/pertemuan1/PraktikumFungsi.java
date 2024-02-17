import java.util.Scanner;

public class PraktikumFungsi {

    static void hitungPendapatan(int arr[][], int cabang) {
        int Aglonema = arr[cabang][0] * 75000,
            Keladi = arr[cabang][1] * 50000,
            Alocasia = arr[cabang][2] * 60000,
            Mawar = arr[cabang][3] * 10000,
            total = Aglonema + Keladi + Alocasia + Mawar;

        System.out.println("Cabang Toko Royal Garden " + (cabang + 1));
        System.out.println("Aglonema: " + Aglonema);
        System.out.println("Keladi: " + Keladi);
        System.out.println("Alocasia: " + Alocasia);
        System.out.println("Mawar: " + Mawar);
        System.out.println("Total: " + total);
    }

    static int[][] cekStokToko(int arr[][], int cabang) {
        arr[cabang][0] = arr[cabang][0] - 1;
        arr[cabang][1] = arr[cabang][1] - 2;
        arr[cabang][2] = arr[cabang][2] - 0;
        arr[cabang][3] = arr[cabang][3] - 5;
        return arr;
    }

    static void cekStatus(int arr[][], int cabang) {
        int Aglonema = arr[cabang][0],
            Keladi = arr[cabang][1],
            Alocasia = arr[cabang][2],
            Mawar = arr[cabang][3];

        System.out.println("Cabang Toko Royal Garden " + (cabang + 1));
        System.out.println("Aglonema: " + Aglonema);
        System.out.println("Keladi: " + Keladi);
        System.out.println("Alocasia: " + Alocasia);
        System.out.println("Mawar: " + Mawar);
    }


    public static void main(String[] args) {
        // Deklarasi Variabel
        Scanner sc = new Scanner(System.in);
        int cabangToko;
        int[][] RoyalGarden = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        }, 
        update;

        // Input nilai
        System.out.print("Pilih cabang (1-4) : ");
        cabangToko = sc.nextInt() - 1;
        System.out.println("===============");

        update = cekStokToko(RoyalGarden, cabangToko);
        
        System.out.println("\nStatus Toko:" );
        cekStatus(update, cabangToko);

        System.out.println("\nPendapatan Toko: ");
        hitungPendapatan(update, cabangToko);
    }
}
