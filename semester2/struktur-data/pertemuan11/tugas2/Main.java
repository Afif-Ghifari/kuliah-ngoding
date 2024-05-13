public class Main {
   public static void main(String[] args) {
    linkedListQueue queue = new linkedListQueue();

        // Enqueue beberapa mahasiswa
        queue.enqueue(111, "Anton");
        queue.enqueue(112, "Prita");
        queue.enqueue(113, "Yusuf");
        queue.enqueue(114, "Doni");
        queue.enqueue(115, "Sari");

        // Menampilkan antrian mahasiswa
        System.out.println("Queue:");
        queue.print();

        // Dequeue satu mahasiswa
        queue.dequeue();

        // Menampilkan antrian setelah satu mahasiswa dikeluarkan
        System.out.println("Queue setelah dequeue:");
        queue.print();
   } 
}
