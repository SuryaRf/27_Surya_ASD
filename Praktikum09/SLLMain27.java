package Praktikum09;

public class SLLMain27 {
    public static void main(String[] args) {
        LinkedList27 myLinkedList = new LinkedList27();

        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.addLast(500);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();
        // myLinkedList.insertAt(2, 400); // Menambahkan 400 pada indeks 2
        // myLinkedList.print();

        // System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));
        // System.out.println("Data 300 berada pada index ke: " + myLinkedList.indexOf(300));
        
        // myLinkedList.remove(300);
        // myLinkedList.print();
        // myLinkedList.removeFirst();
        // myLinkedList.print();
        // myLinkedList.removeLast();
        // myLinkedList.print();

        // Menambahkan node sebelum keyword tertentu
        myLinkedList.insertBefore(300, 200);
        myLinkedList.print();
        
        // Menambahkan node pada indeks tertentu
        myLinkedList.insertAt(2, 100);
        myLinkedList.print();
        
        // Menghapus node pada indeks tertentu
        myLinkedList.removeAt(2);
        myLinkedList.print(); // tambahan pada tugas nomer 1
    
    
    }

}
