package Tugas_Akhir.DoubleLinked_List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class DoubleLinkedList27 {
    private Node27 head;
    private Node27 tail;

    public void addFirst(Mahasiswa27 data) {
        Node27 newNode27 = new Node27(data);
        if (head == null) {
            head = tail = newNode27;
        } else {
            newNode27.next = head;
            head.prev = newNode27;
            head = newNode27;
        }
    }

    public void addLast(Mahasiswa27 data) {
        Node27 newNode27 = new Node27(data);
        if (tail == null) {
            head = tail = newNode27;
        } else {
            newNode27.prev = tail;
            tail.next = newNode27;
            tail = newNode27;
        }
    }

    public void remove(String nim) {
        Node27 current = head;
        while (current != null) {
            if (current.data.getNim().equals(nim)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    public Mahasiswa27 get(String nim) {
        Node27 current = head;
        while (current != null) {
            if (current.data.getNim().equals(nim)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void printAll() {
        Node27 current = head;
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }

    public void update(String nim, String nama, String tglLahir,String jurusan, int angkatan, String alamat) {
        Node27 current = head;
        while (current != null) {
            if (current.data.getNim().equals(nim)) {
                if (!nama.isEmpty()) current.data.setNama(nama);
                if (!tglLahir.isEmpty()) current.data.setTglLahir(tglLahir);
                if (!jurusan.isEmpty()) current.data.setJurusan(jurusan);
                if (angkatan == 0) current.data.setAngkatan(angkatan);
                if (!alamat.isEmpty()) current.data.setAlamat(alamat);
                return;
            }else{
                System.out.println("Mahasiswa tidak ditemukan! ");
            }
            current = current.next;
        }
    }

    public void searchByName(String nama) {
        Node27 current = head;
        while (current != null) {
            if (current.data.getNama().equalsIgnoreCase(nama)) {
                System.out.println(current.data);
            }
            current = current.next;
        }
    }

    public int count() {
        int count = 0;
        Node27 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void exportToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            Node27 current = head;
            while (current != null) {
                writer.write(current.data.toString());
                writer.newLine();
                current = current.next;
            }
            System.out.println("Data telah diekspor ke " + filename);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat mengekspor data.");
            e.printStackTrace();
        }

        
    }
    public void sortByName() {
        if (head == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node27 current = head;

            while (current.next != null) {
                if (current.data.getNama().compareToIgnoreCase(current.next.data.getNama()) > 0) {
                    Mahasiswa27 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
    
}
