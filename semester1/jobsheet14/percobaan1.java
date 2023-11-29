public class percobaan1 {
    // fungsi
    static int faktorialRekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRekursif(n - 1));
        }
    }

    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }

    // fungsi main
    public static void main(String[] args) {
        // penggunaan fungsi
        System.out.println(faktorialIteratif(5));
        System.out.println(faktorialRekursif(5));
    }
}
