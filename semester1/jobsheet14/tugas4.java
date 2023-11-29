public class tugas4 {
    // fungsi
    static int Fibonacci(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return Fibonacci(bulan - 1) + Fibonacci(bulan - 2);
        }
    }

    // fungsi main
    public static void main(String[] args) {
        // deklarasi variabel
        int bulan = 12,
            jmlMarmut;

        // input nilai
        jmlMarmut = Fibonacci(bulan);
        System.out.println("Jumlah marmut pada bulan " + bulan + " adalah: " + jmlMarmut);
    }
}
