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
        if (head == null) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
    
        System.out.println("+------------+----------------+-------------+--------------------+-----------+------------------+---------------+");
        System.out.println("| NIM        | Nama           | Tgl Lahir   | Jurusan            | Angkatan  | Alamat           | Jenis Kelamin |");
        System.out.println("+------------+----------------+-------------+--------------------+-----------+------------------+---------------+");
    
        Node27 current = head;
        while (current != null) {
            Mahasiswa27 mhs = current.data;
            System.out.printf("| %-10s | %-14s | %-11s | %-18s | %-9d | %-16s | %-13s |\n",
                mhs.getNim(), mhs.getNama(), mhs.getTglLahir(), mhs.getJurusan(), mhs.getAngkatan(), mhs.getAlamat(), mhs.getJenisKelamin());
            current = current.next;
        }
    
        System.out.println("+------------+----------------+-------------+--------------------+-----------+------------------+---------------+");
    }
    

    public void update(String nim, String nama, String tglLahir, String jurusan, int angkatan, String alamat, String jenisKelamin) {
        Node27 current = head;
        while (current != null) {
            if (current.data.getNim().equals(nim)) {
                if (!nama.isEmpty()) current.data.setNama(nama);
                if (!tglLahir.isEmpty()) current.data.setTglLahir(tglLahir);
                if (!jurusan.isEmpty()) current.data.setJurusan(jurusan);
                if (angkatan != 0) current.data.setAngkatan(angkatan);
                if (!alamat.isEmpty()) current.data.setAlamat(alamat);
                if (!jenisKelamin.isEmpty()) current.data.setJenisKelamin(jenisKelamin);
                return;
            }
            current = current.next;
        }
        System.out.println("Mahasiswa tidak ditemukan!");
    }

    public void searchByName(String nama) {
        Node27 current = head;
        boolean found = false;
        while (current != null) {
            if (current.data.getNama().equalsIgnoreCase(nama)) {
                System.out.println(
                    "+------------+----------------+-------------+--------------------+-----------+------------------+---------------+");
                System.out.println(
                    "| NIM        | Nama           | Tgl Lahir   | Jurusan            | Angkatan  | Alamat           | Jenis Kelamin |");
                System.out.println(
                    "+------------+----------------+-------------+--------------------+-----------+------------------+---------------+");
                System.out.printf("| %-10s | %-14s | %-11s | %-18s | %-9d | %-16s | %-13s |\n",
                    current.data.getNim(), current.data.getNama(), current.data.getTglLahir(),
                    current.data.getJurusan(), current.data.getAngkatan(), current.data.getAlamat(),
                    current.data.getJenisKelamin());
                System.out.println(
                    "+------------+----------------+-------------+--------------------+-----------+------------------+---------------+");
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Mahasiswa tidak ditemukan.");
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
