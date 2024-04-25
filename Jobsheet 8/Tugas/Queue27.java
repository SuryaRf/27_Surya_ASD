package Tugas;

public class Queue27 {
    Pasien27[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue27(int n) {
        max = n;
        antrian = new Pasien27[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(antrian[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void enqueue(Pasien27 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pasien27 dequeue() {
        Pasien27 dt = new Pasien27();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }  
        }
        return dt;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noID + " "
                    + antrian[front].jenisKelamin + " " + antrian[front].umur);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if (!IsEmpty()) {
            System.out.println("Elemen terbelakang: " + antrian[rear].nama + " " + antrian[rear].noID + " "
            + antrian[rear].jenisKelamin + " " + antrian[rear].umur);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public int peekPosition(String nama) {
        if (!IsEmpty()) {
            int currentPos = front;
            int count = 1;
            while (currentPos != rear) {
                if (antrian[currentPos].nama.equals(nama)) {
                    return count;
                }
                count++;
                currentPos = (currentPos + 1) % max;
            }
            // Periksa elemen terakhir (rear)
            if (antrian[currentPos].nama.equals(nama)) {
                return count;
            }
        }
        // Kembalikan -1 jika nama tidak ditemukan atau antrian kosong
        return -1;
    }

    public void daftarPasien() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Daftar Pasien:");
            int currentPos = front;
            while (currentPos != rear) {
                System.out.println(antrian[currentPos].nama + " " + antrian[currentPos].noID + " "
                    + antrian[currentPos].jenisKelamin + " " + antrian[currentPos].umur);
                currentPos = (currentPos + 1) % max;
            }
            // Cetak elemen terakhir (rear)
            System.out.println(antrian[currentPos].nama + " " + antrian[currentPos].noID + " "
                + antrian[currentPos].jenisKelamin + " " + antrian[currentPos].umur);
            System.out.println("Jumlah Pasien: " + size);
        }
    }
}
