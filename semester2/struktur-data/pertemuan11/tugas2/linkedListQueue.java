public class linkedListQueue {
    node head, tail;
    
    public linkedListQueue(){
        this.head = null;
        this.tail = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    public void enqueue(int nim, String nama){
       node newNode = new node(nim, nama);
       if (tail == null) {
            head = tail = newNode;
            return;
       }
       tail.next = newNode;
       tail = newNode;
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, " + "tidak dapat dihapus");
        } else {
            System.out.println("Dequeue: " + head.nim + " " + head.nama);
            head = head.next;
            if (head == null) {
                tail = null; 
            }
        }
    }

    public void print(){
        if (!isEmpty()) {
            node tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.nim + " " + tmp.nama + "\t");
                tmp = tmp.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("Linked List kosong");
        }
    }
}
