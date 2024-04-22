public class MahasiswaListing {
    Mahasiswa[] list = new Mahasiswa[30];

    void tambah(Mahasiswa mhs){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = mhs;
                break;
            }
        }
    }
    void tampilAll(){
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.print((i+1)+".");
                System.out.println("Nama\t: "+list[i].nama);
                System.out.println();
                System.out.print("  Data\t: ");
                for (int j = 0; j < 17; j++) {
                    System.out.print(list[i].data[j]+" ");
                }
            }
        }
    }

    void SelectionSortData(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    int binarySearchData(int mhs, int cari, int left, int right){
        int mid;
        if(right >= left) {
            mid = (left + right) / 2;
            if (cari == list[mhs].data[mid]) {
                return mid;
            } else if(list[mhs].data[mid] > cari) {
                return binarySearchData(mhs, cari, left, mid - 1);
            } else {
                return binarySearchData(mhs, cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilSearch(int hasil, int mhs){
        if (hasil == -1) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("Data ada di indeks ke-" + hasil);
            System.out.println("Nilai data: " + list[mhs].data[hasil]);
        }
    }
}
