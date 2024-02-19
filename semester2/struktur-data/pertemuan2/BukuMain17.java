public class BukuMain17 {
    public static void main(String[] args) {
        int bukuTerjual = 5;

        Buku17 bk1 = new Buku17();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilnformasi();
        bk1.terjual(bukuTerjual);
        bk1.gantiHarga(60000);
        bk1.tampilnformasi();

        int totalTerjual = bk1.hitungHargaTotal(bukuTerjual);
        int totalDiskon = (int)bk1.hitungDiskon(totalTerjual);
        int totalBayar = bk1.hitungHargaBayar(totalDiskon, totalTerjual);
        System.out.println("Total yang harus dibayar: "+totalBayar);
        // Buku17 bk2 = new Buku17("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        // bk2.terjual(11);
        // bk2.tampilnformasi();

        // Buku17 bukuAfif = new Buku17("1984", "George Orwell", 160, 17, 80000);
        // bukuAfif.tampilnformasi();
    }
}
