package Jobsheet12.DoubleLinkedList;

public class Queue27 {
    Node27_1 head;
    Node27_1 tail;
    int size;

    public Queue27() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(int nomorAntrian, String nama) {
        Node27_1 newNode = new Node27_1(nomorAntrian, nama);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        String nama = head.nama;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println();
        System.out.println( nama + " telah divaksinasi.");
    }
    

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }System.out.println("+------------------------------------------+");
        System.out.println("           DAFTAR PENGANTRI VAKSIN");
        System.out.println("+------------------------------------------+");
        System.out.println();
        System.out.println("+------------------------------------------+");
        System.out.println("| Nomor Antrian    | Nama Penerima Vaksin  |");
        System.out.println("+------------------------------------------+");
        Node27_1 current = head;
        while (current != null) {
            System.out.printf("| %-17d| %-22s|%n", current.nomorAntrian, current.nama);
            current = current.next;
        }
        System.out.println("+------------------------------------------+");
    }
    
    

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

