package Praktikum09;

public class LinkedList27 {
    Node27 head;

    public LinkedList27() {

    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi Linked List:");
            Node27 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(int input) {
        Node27 newNode = new Node27(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node27 newNode = new Node27(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node27 currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;

            }
            currentNode.next = newNode;

        }
    }

    public void insertAfter(int key, int input) {
        Node27 newNode = new Node27(input, null);

        if (!isEmpty()) {
            Node27 currentNode = head;

            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.println("Linked List Kosong");
        }
    }



    public int getData(int index) {
        Node27 currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }


    // public int getData(int index) {
    //     Node27 currentNode = head;
    
    //     for (int i = 0; i < index && currentNode != null; i++) {
    //         currentNode = currentNode.next;
    //     }
        
    //     if (currentNode == null) {
    //         throw new IndexOutOfBoundsException("Indeks melebihi jumlah node pada linked list");
    //     } else {
    //         return currentNode.data;
    //     }
    // } MODIFIKASI
    
    public int indexOf(int key) {
        Node27 currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node27 currentNode = head;

            while (currentNode.next != null)
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
            currentNode = currentNode.next;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node27 currentNode = head;

            while (currentNode.next != null)
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
            currentNode = currentNode.next;
        }
    }

    public void insertBefore(int key, int input) {
        Node27 newNode = new Node27(input, null);
    
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
    
        if (head.data == key) {
            addFirst(input);
            return;
        }
    
        Node27 prevNode = null;
        Node27 currentNode = head;
    
        while (currentNode != null && currentNode.data != key) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    
        if (currentNode == null) {
            System.out.println("Keyword tidak ditemukan");
        } else {
            newNode.next = currentNode;
            prevNode.next = newNode;
        }
    }// tambahan pada tugas nomer 1
    

    public void insertAt(int index, int key) {
        Node27 newNode = new Node27(key, null);

        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }

        if (index == 0) { // Insert di awal
            addFirst(key);
        } else {
            Node27 currentNode = head;
            int currentIndex = 0;

            while (currentNode != null && currentIndex < index - 1) {
                currentNode = currentNode.next;
                currentIndex++;
            }

            if (currentNode == null) { // Jika indeks yang diminta lebih besar dari ukuran linked list
                System.out.println("Indeks melebihi ukuran linked list");
            } else {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }// tambahan pada tugas nomer 1
    }

    public void removeAt(int index){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }

        if (index < 0 ) {
            System.out.println("Indeks tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node27 prevNode = null;
        Node27 currentNode = head;
        int currentIndex = 0;

        while (currentNode != null && currentIndex < index) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode == null) {
            System.out.println("Indeks melebihi ukuran linked list");
        }else{
            prevNode.next = currentNode.next;
        }
    }// tambahan pada tugas nomer 1

}
