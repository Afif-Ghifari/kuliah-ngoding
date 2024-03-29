public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();

        Hotel h1 = new Hotel("H1", "Jakarta", 1000000, (byte) 5);
        Hotel h2 = new Hotel("H2", "Bandung", 750000, (byte) 4);
        Hotel h3 = new Hotel("H3", "Surabaya", 300000, (byte) 3);
        Hotel h4 = new Hotel("H4", "Malang", 100000, (byte) 2);
        Hotel h5 = new Hotel("H4", "Malang", 75000, (byte) 1);

        list.tambah(h2);
        list.tambah(h5);
        list.tambah(h3);
        list.tambah(h1);
        list.tambah(h4);
    
        System.out.println("Daftar hotel:");
        list.tampilAll();
        System.out.println();

        // System.out.println("Daftar hotel setelah sorting berdasarkan bintang:");
        // list.bubbleSort();
        System.out.println("Daftar hotel setelah sorting berdasarkan harga termurah:");
        list.selectionSort();
        list.tampilAll();
    }
}
