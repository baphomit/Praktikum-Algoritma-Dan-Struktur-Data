package Tugas1;
public class Node {
    String nama;
    int no;
    Node prev, next;

    Node(Node prev, int no, String nama, Node next) {
        this.prev = prev;
        this.nama = nama;
        this.no = no;
        this.next = next;
    }
}