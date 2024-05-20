import java.util.Random;

public class SLL {
    Node head, tail;

    String polePosition[] = new String[20];
    int poinPole[] = new int[20];

    boolean isEmpty() {
        return head == null;
    }

    // Method utama
    public void printTeam() {
        sortPointDesc();
        if (!isEmpty()) {
            Node tmp = head;
            int i = 1;
            while (tmp != null) {
                tmp.poinTim = tmp.poinPembalap[0] + tmp.poinPembalap[1];
                System.out.println(i + ". Nama Tim : " + tmp.tim);
                System.out.println("   Poin : " + tmp.poinTim);
                System.out.println("   Pembalap pertama : " + tmp.pembalap[0] + " - " + tmp.poinPembalap[0]);
                System.out.println("   Pembalap kedua : " + tmp.pembalap[1] + " - " + tmp.poinPembalap[1]);
                System.out.println();
                tmp = tmp.next;
                i++;
            }
        } else {
            System.out.println("Data kosong");
        }
    }

    public void addFirst(String tim, String pembalap1, String pembalap2) {
        Node newInput = new Node(tim, pembalap1, pembalap2);
        if (!isEmpty()) {
            newInput.next = head;
            head = newInput;
            System.out.println("Data di tambahkan");
        } else {
            head = newInput;
            tail = newInput;
            System.out.println("Data di tambahkan");
        }
    }

    public void addLast(String tim, String pembalap1, String pembalap2) {
        Node newInput = new Node(tim, pembalap1, pembalap2);
        if (!isEmpty()) {
            tail.next = newInput;
            tail = newInput;
            System.out.println("Data di tambahkan");
        } else {
            head = newInput;
            tail = newInput;
            System.out.println("Data di tambahkan");
        }
    }

    public void insertAt(int index, String tim, String pembalap1, String pembalap2) {
        index -= 1;
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            addFirst(tim, pembalap1, pembalap2);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newInput = new Node(tim, pembalap1, pembalap2);
        newInput.next = temp.next;
        temp.next = newInput;
        if (newInput.next == null) {
            tail = newInput;
        }
        System.out.println("Data di tambahkan");
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
            System.out.println("Data di hapus");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Data di hapus");
        } else {
            System.out.println("Data kosong");
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            System.out.println("Data di hapus");

        } else if (head == tail) {
            head = tail = null;
            System.out.println("Data di hapus");
        } else {
            System.out.println("Data kosong");
        }
    }

    public void remove(int index) {
        index -= 1;
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
            System.out.println("Data di hapus");
        }
    }

    // Method tambahan
    public void sortPointDesc() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node previous = null;
            Node next = head.next;

            while (next != null) {
                if (current.poinTim < next.poinTim) {
                    swapped = true;
                    if (previous == null) {
                        Node temp = next.next;
                        next.next = current;
                        current.next = temp;
                        head = next;
                        previous = next;
                    } else {
                        Node temp = next.next;
                        next.next = current;
                        current.next = temp;
                        previous.next = next;
                        previous = next;
                    }
                } else {
                    previous = current;
                    current = next;
                }
                next = current.next;
            }
        } while (swapped);
    }

    public void givePoint() {
        int[] points = { 25, 18, 15, 12, 10, 8, 6, 4, 2, 1 };
        int i = 0;
        while (i < 10) {
            poinPole[i] += points[i];
            i++;
        }

        Node tmp = head;
        for (int j = 0; j < polePosition.length; j++) {
            while (tmp != null) {

                if (polePosition[j].equals(tmp.pembalap[1])) {
                    tmp.poinPembalap[1] += poinPole[j];
                }
                if (polePosition[j].equals(tmp.pembalap[0])) {
                    tmp.poinPembalap[0] += poinPole[j];
                }

                tmp = tmp.next;

            }
            tmp = head;

        }
    }

    void printRace() {
        for (int i = 0; i < polePosition.length; i++) {
            System.out.println((i + 1) + ".  " + polePosition[i] + " - " + poinPole[i]);
        }
    }

    void shufflePole() {
        Random rand = new Random();
        for (int i = polePosition.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = polePosition[i];
            polePosition[i] = polePosition[j];
            polePosition[j] = temp;

            int tempPoin = poinPole[i];
            poinPole[i] = poinPole[j];
            poinPole[j] = tempPoin;
        }
    }

    void qualifikasi() {
        Node tmp = head;
        int i = 0;
        while (tmp != null) {
            if (i < polePosition.length) {
                polePosition[i] = tmp.pembalap[0];
                i++;
            }
            if (i < polePosition.length) {
                polePosition[i] = tmp.pembalap[1];
                i++;
            }
            tmp = tmp.next;
        }
        shufflePole();

        System.out.println("Pole Position: ");
        printRace();
    }

    void startRace() {
        shufflePole();
        System.out.println("Race telah dimulai!");
        System.out.println("Hasil race:");
        givePoint();
        sortPointDesc();
        printRace();
    }

    void printPodium() {
        for (int i = 0; i < polePosition.length - 1; i++) {
            for (int j = 1; j < polePosition.length - i; j++) {
                if (poinPole[j] > poinPole[j - 1]) {
                    String tmpString = polePosition[j];
                    polePosition[j] = polePosition[j - 1];
                    polePosition[j - 1] = tmpString;

                    int tmpPoin = poinPole[j];
                    poinPole[j] = poinPole[j - 1];
                    poinPole[j - 1] = tmpPoin;
                }
            }
        }
        for (int num = 0; num < polePosition.length; num++) {
            System.out.println((num + 1) + ". " + polePosition[num] + " - " + poinPole[num]);
        }
    }
}
