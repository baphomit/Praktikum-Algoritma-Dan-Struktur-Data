package Praktikum;

public class Node_2 {
    int data;
    Node prev, next;

    Node_2(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}