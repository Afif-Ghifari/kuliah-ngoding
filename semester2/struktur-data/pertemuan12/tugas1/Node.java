public class Node {
    Antrian data;
    Node prev, next;

    Node(Node prev, Antrian data, Node next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }
}