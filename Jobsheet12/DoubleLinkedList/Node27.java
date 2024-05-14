package Jobsheet12.DoubleLinkedList;

public class Node27 {
    int data;
    Node27 prev, next;

    Node27(Node27 prev, int data, Node27 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Node27(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
