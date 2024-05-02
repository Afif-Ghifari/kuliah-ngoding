public class Gudang17 {
    Barang17[] tumpukan;
    int size, top;

    public Gudang17(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang17[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang17 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang penuh");
        }
    }

    public Barang17 ambilBarang() {
        if (!cekKosong()) {
            Barang17 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang17 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            // return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            // return null;
        }
    }

    public void lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang17 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public void cariBarang(String cari) {
        if (!cekKosong()) {
            for (int i = 0; i < tumpukan.length; i++) {
                if (tumpukan[i].nama.equalsIgnoreCase(cari)) {
                    System.out.println("Barang ditemukan");
                    System.out.println("Kode: " + tumpukan[i].kode);
                    System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(tumpukan[i].kode));
                    System.out.println("Barang: " + tumpukan[i].nama);
                    System.out.println("Kategori: " + tumpukan[i].kategori);
                    break;
                } else {
                    if (i == tumpukan.length - 1 && !tumpukan[i].nama.equalsIgnoreCase(cari)) {
                        System.out.println("Barang tidak ditemukan"); 
                    }
                }
            }
        } else {
            System.out.println("Tumpukan barang kosong");
            
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
    

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi17 stack = new StackKonversi17();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
