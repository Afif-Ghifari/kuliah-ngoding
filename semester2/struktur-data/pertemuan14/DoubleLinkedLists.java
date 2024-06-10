public class DoubleLinkedLists {
    Node17 head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node17(null, item, jarak, null);
        } else {
            Node17 newNode = new Node17(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node17 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        return tmp.jarak;
    }

    public int get(int index) throws Exception {
        if (index >= size || index < 0) {
            throw new Exception("Nilai indeks di luar batas");
        }
    
        if (head == null) {
            throw new Exception("List is empty");
        }
    
        Node17 tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp.next == null) {
                throw new Exception("Unexpected null node encountered");
            }
            tmp = tmp.next;
        }
    
        return tmp.data;
    }
    
    

    /*public int get(int index)throws Exception{
        if (index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node17 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }*/

    /*public int get(int index) throws Exception {
        if (index > size || index < 0) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node17 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }*/

    /*public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node17 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node17 newNode = new Node17(current, item, null);
            current.next = newNode;
            size++;
        }
    }*/

    /*public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks diluar batas");
        } else {
            Node17 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node17 newNode = new Node17(current.prev, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node17 newNode = new Node17(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }*/

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node17 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // Praktikum 2
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node17 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) {
        Node17 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    // Praktikum 3
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node17 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

}
