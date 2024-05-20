public class Node {
    String tim, pembalap[] = new String[2];
    int poinTim, poinPembalap[] = new int[2];
    Node next;

    Node(String tim, String pembalap1, String pembalap2) {
        this.tim = tim;
        pembalap[0] = pembalap1;
        pembalap[1] = pembalap2;
        poinTim = 0;
        poinPembalap[0] = 0;
        poinPembalap[1] = 0;
        next = null;
    } 
}
