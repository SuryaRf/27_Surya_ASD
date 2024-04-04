public class Stack27_2 {
    int size;
    int top;
    Pakaian27 data[];

    public Stack27_2(int size){
        this.size = size;
        data = new Pakaian27[size];
        top = -1;
    }
    public boolean isFull() {
        if (top == size-1) {
            return true;
        }else
        return false;
     }
     public boolean isEmpty() {
        if (top == -1) {
            return true;
        }else
        return false;
     }
     public void push (Pakaian27 pkn){
        if (!isFull()) {
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi Stack penuh");
        }
     }

     public void pop(){
        if (!isEmpty()) {
            Pakaian27 x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
     }

     public void peek(){
        System.out.println("Elemen teratas stack: " + data[top].jenis  + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
     }
     public void print(){
        System.out.println("Isi stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis  + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
        }
        System.out.println(" ");
     }

     public void clear(){
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
     } 
     
     public void getMax() {
        if (!isEmpty()) {
            Pakaian27 maxPakaian = data[0]; // Asumsikan elemen pertama sebagai pakaian dengan harga tertinggi
            for (int i = 1; i <= top; i++) {
                if (data[i].harga > maxPakaian.harga) { // Jika harga pakaian saat ini lebih tinggi dari harga pakaian tertinggi sebelumnya
                    maxPakaian = data[i]; // Update pakaian dengan harga tertinggi
                }
            }
            // Tampilkan data pakaian dengan harga tertinggi
            System.out.println("Data pakaian dengan harga tertinggi:");
            System.out.println("Jenis: " + maxPakaian.jenis);
            System.out.println("Warna: " + maxPakaian.warna);
            System.out.println("Merk: " + maxPakaian.merk);
            System.out.println("Ukuran: " + maxPakaian.ukuran);
            System.out.println("Harga: " + maxPakaian.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
