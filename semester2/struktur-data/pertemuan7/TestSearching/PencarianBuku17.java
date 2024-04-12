public class PencarianBuku17 {
    Buku17 listBk[] = new Buku17[5];
    int idx;

    void tambah(Buku17 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Buku17 m : listBk) {
            m.tampilDataBuku();
        }
    }

    // public int FindSeqSearch(String cari) {
    //     int posisi = 0;
    //     for (int i = 0; i < listBk.length; i++) {
    //         if (listBk[i].kodeBuku.equals(cari)) {
    //             posisi = i;
    //             break;
    //         } else {
    //             posisi = -1;
    //         }
    //     }
    //     return posisi;
    // }

    // public int FindBinarySearch(String cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (left + right) / 2;
    //         if (cari.equals(listBk[mid].kodeBuku)) {
    //             return mid;
    //         } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }

    public void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku : " + listBk[pos].kodeBuku);
            System.out.println("Judul Buku : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBk[pos].pengarang);
            System.out.println("Stock : " + listBk[pos].stock);
        }
    }

    public void TampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public int FindSeqJudul(String cari){
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i] != null && listBk[i].judulBuku.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public int FindBinaryJudul(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].judulBuku)) {
                return mid;
            } else if (listBk[mid].judulBuku.compareTo(cari) > 0) {
                return FindBinaryJudul(cari, left, mid - 1);
            } else {
                return FindBinaryJudul(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void bubbleSort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 1; j < listBk.length - i; j++) {
                if (listBk[j] != null && listBk[j - 1] != null) {
                    if (listBk[j].kodeBuku < listBk[j - 1].kodeBuku) {
                        Buku17 temp = listBk[j];
                        listBk[j] = listBk[j - 1];
                        listBk[j - 1] = temp;
                    }
                }
            }
        }
    }

}
