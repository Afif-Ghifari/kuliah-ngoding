public class Buku17 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilnformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0 || jml > stok) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int terjual) {
        int total = harga * terjual;
        return total;
    }

    double hitungDiskon(int total) {
        double diDiskon = 0;
        if (total > 150000) {
            diDiskon = total * 0.12;
        } else if (total > 75000) {
            diDiskon = total * 0.5;
        } 
        return diDiskon;
    }

    int hitungHargaBayar(int hargaDiskon, double hargaTotal) {
        int tagihan = (int)hargaTotal - hargaDiskon;
        return tagihan;
    }

    public Buku17() {

    }

    public Buku17(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}