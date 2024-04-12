public class Buku17 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;
    int posisi;
    Buku17[] listBk = new Buku17[5];

    Buku17() {
        
    }

    Buku17(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    void tambahBuku(Buku17 m) {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i] == null) {
                listBk[i] = m;
                break;
            }
        }
    }

    public void tampilDataBuku() {
            System.out.println("=========================");
            System.out.println("Kode Buku : " + kodeBuku);
            System.out.println("Judul Buku : " + judulBuku);
            System.out.println("Tahun Terbit : " + tahunTerbit);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("Stock : " + stock);   
    }

    public void tampilAllBuku() {
        for (Buku17 bk : listBk) {
            System.out.println("=========================");
            System.out.println("Kode Buku : " + bk.kodeBuku);
            System.out.println("Judul Buku : " + bk.judulBuku);
            System.out.println("Tahun Terbit : " + bk.tahunTerbit);
            System.out.println("Pengarang : " + bk.pengarang);
            System.out.println("Stock : " + bk.stock);
        }
    }

    public void tampilDataBuku(int pos) {
            System.out.println("=========================");
            System.out.println("Kode Buku : " + listBk[pos].kodeBuku);
            System.out.println("Judul Buku : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBk[pos].pengarang);
            System.out.println("Stock : " + listBk[pos].stock);
    }

    // public int FindBuku(String cari){
    //     int pos = 0;
    //     for (int i = 0; i < listBk.length; i++) {
    //         if (listBk[i].kodeBuku.equals(cari)) {
    //             pos = i;
    //             break;
    //         } else {
    //             pos = -1;
    //         }
    //     }
    //     return pos;
    // }
}
