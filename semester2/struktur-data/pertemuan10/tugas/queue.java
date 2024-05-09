public class queue {
    pembeli[] antrian;
    int front, rear, size, max;

    public queue(int n){
        max = n;
        antrian = new pembeli[max];
        size = 0;
        front = rear = -1;  
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;            
        }
    }

    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(pembeli antri){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0); //menghentikan program
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public pembeli dequeue(){
        pembeli antri = new pembeli();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0); //menghentikan program
        } else {
            antri = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return antri;
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " ");
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " +  "\nNama: "+antrian[front].nama + "\nNo HP" + antrian[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + "\nNama: " + antrian[rear].nama + " \nNo HP: " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public int peekPosition(String nama){
        if (isEmpty()) {
            return -1; // Kembalikan -1 jika antrian kosong
        }
        int pos = -1; // Inisialisasi posisi dengan -1 (tidak ditemukan)
        int index = front;
        int count = 0;
        while (index != rear){
            if (antrian[index].nama.equals(nama)) {
                pos = count; // Simpan posisi saat nama ditemukan
                break;
            }
            index = (index + 1) % max; // Geser ke elemen berikutnya dalam antrian
            count++;
        } if (antrian[index].nama.equals(nama)) {
            pos = count;
        }
        if (pos != -1) {
            System.out.println("Pembeli dengan nama " + nama + " ditemukan di antrian ke-" + (pos + 1));
            System.out.println("Detail Pembeli:");
            System.out.println("Nama: " + antrian[(front + pos) % max].nama);
            System.out.println("No HP: " + antrian[(front + pos) % max].noHP);
        } else {
            System.out.println("Pembeli dengan nama " + nama + " tidak ditemukan dalam antrian");
        }
        return pos; // Kembalikan posisi, -1 jika tidak ditemukan
    }

    public void daftarPembeli(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Daftar Pembeli:");
            int i = front;
            do {
                System.out.println("Nama: " + antrian[i].nama + " \nNo HP: " + antrian[i].noHP);
                i = (i + 1) % max;
                System.out.println("===============");
            } while (i != (rear + 1) % max);
        }
    }
}
