public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    double hitungLuas(int a, int t) {
        return a * t / 2;
    }

    double hitungKeliling(int a, int t) {
        double miring = Math.sqrt(a * a + t * t);
        return a + t + miring;
    }
}
