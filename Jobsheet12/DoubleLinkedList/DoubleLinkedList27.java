package Jobsheet12.DoubleLinkedList;

public class DoubleLinkedList27 {
    Node27 head;
    int size;

    public DoubleLinkedList27(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    

    public void addFirst (int item){
        if (isEmpty()) {
            head = new Node27(null, item, null);
        }else{
            Node27 newNode = new Node27(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item){
        if (isEmpty()) {
            addFirst(item);
        }else{
            Node27 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node27 newNode = new Node27(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int data, int index) {
        try {
            if (index < 0 || index > size) {
                throw new Exception("Nilai indeks di luar batas");
            }
            
            if (index == 0) {
                addFirst(data);
            } else if (index == size) {
                addLast(data);
            } else {
                Node27 newNode = new Node27(data);
                Node27 current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
                size++;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // public void add(int data, int index) {
    //     if (index < 1 || index > size + 1) {
    //         System.out.println("Indeks di luar batas.");
    //         return;
    //     }

    //     // Ubah indeks eksternal menjadi indeks internal
    //     index--;

    //     if (index == 0) {
    //         addFirst(data);
    //     } else if (index == size) {
    //         addLast(data);
    //     } else {
    //         Node27 newNode = new Node27(data);
    //         Node27 current = head;
    //         for (int i = 0; i < index - 1; i++) {
    //             current = current.next;
    //         }
    //         newNode.next = current.next;
    //         newNode.prev = current;
    //         current.next.prev = newNode;
    //         current.next = newNode;
    //         size++;
    //     }
    // } MODFIKASI SOAL NOMER 2 PRAKKTIKUM 3
    
    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        size = 0;
    }
    public void print(){
        if (!isEmpty()) {
            Node27 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    //PRAKTIKUM 2
    public void removeFirst() {
        try {
            if (isEmpty()) {
                throw new Exception("Linked masih kosong, tidak dapat dihapus");
            } else if (size == 1) {
                head = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void removeLast() {
        try {
            if (isEmpty()) {
                throw new Exception("Linked masih kosong, tidak dapat dihapus");
            } else if (head.next == null) {
                head = null;
            } else {
                Node27 current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
            size--;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    

    public void remove(int index) {
        try {
            if (isEmpty() || index >= size) {
                throw new Exception("Nilai indeks di luar batas");
            } else if (index == 0) {
                removeFirst();
            } else if (index == size - 1) {
                removeLast();
            } else {
                Node27 current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Praktikum 3

    public int getFirst() {
        try {
            if (isEmpty()) {
                throw new Exception("Linked List kosong");
            }
            return head.data;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1; // Nilai pengganti jika terjadi kesalahan
        }
    }
    

    public int getLast() {
        try {
            if (isEmpty()) {
                throw new Exception("Linked List kosong");
            }
            Node27 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            return tmp.data;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1; // Nilai pengganti jika terjadi kesalahan
        }
    }
    

    public int get(int index) {
        try {
            if (isEmpty() || index >= size) {
                throw new Exception("Nilai indeks di luar batas");
            } 
            Node27 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1; // Nilai pengganti jika terjadi kesalahan
        }
    }
    
    // public int get(int index) {
    //     if (index < 1 || index > size) {
    //         System.out.println("Indeks di luar batas.");
    //         return -1;
    //     }

    //     // Ubah indeks eksternal menjadi indeks internal
    //     index--;

    //     Node27 current = head;
    //     for (int i = 0; i < index; i++) {
    //         current = current.next;
    //     }
    //     return current.data;
    // } Modfikasi Soal nomer 2 praktikum 3
    
}


