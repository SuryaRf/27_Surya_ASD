package Jobsheet14;

public class doubleLinkedList27 {

    Node27 head;
    int size;

    public doubleLinkedList27(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    

    public void addFirst (int item, int jarak){
        if (isEmpty()) {
            head = new Node27(null, item, jarak, null);
        }else{
            Node27 newNode = new Node27(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item, int jarak){
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node27 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node27 newNode = new Node27(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }
    

    public void add(int data, int jarak, int index) {
        try {
            if (index < 0 || index > size) {
                throw new Exception("Nilai indeks di luar batas");
            }
    
            if (index == 0) {
                addFirst(data, jarak);
            } else if (index == size) {
                addLast(data, jarak);
            } else {
                Node27 current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                Node27 newNode = new Node27(current, data, jarak, current.next);
                if (current.next != null) {
                    current.next.prev = newNode;
                }
                current.next = newNode;
                size++;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node27 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    
    
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
        Node27 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }else{
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
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

    //SOAL PRAKTIKUM

    public void updateJarak(int data, int jarakBaru) {
        Node27 current = head;
        while (current != null) {
            if (current.data == data) {
                current.jarak = jarakBaru;
                return;
            }
            current = current.next;
        }
        System.out.println("Tidak ada node dengan data " + data);
    }
    
    
}