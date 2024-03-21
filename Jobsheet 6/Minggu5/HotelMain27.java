package Minggu5;

public class HotelMain27 {
    public static void main(String[] args) {
        HotelService27 hotelService = new HotelService27();
        // Membuat objek-objek Hotel
        Hotel27 hotel1 = new Hotel27("Hotel A", "Jakarta", 900000, (byte) 4);
        Hotel27 hotel2 = new Hotel27("Hotel B", "Bandung", 100000, (byte) 3);
        Hotel27 hotel3 = new Hotel27("Hotel C", "Surabaya", 200000, (byte) 2);
        Hotel27 hotel4 = new Hotel27("Hotel D", "Surakarta", 600000, (byte) 9);
        Hotel27 hotel5 = new Hotel27("Hotel E", "Pasuruan", 700000, (byte) 5);
        // Buat objek HotelService

        // Tambahkan objek-objek Hotel ke dalam HotelService
        hotelService.tambah(hotel1);
        hotelService.tambah(hotel2);
        hotelService.tambah(hotel3);
        hotelService.tambah(hotel4);
        hotelService.tambah(hotel5);

        // Tampilkan data hotel dari HotelService
        System.out.println("Daftar Hotel sebelum diurutkan:");
        hotelService.tampil();

        // Urutkan data hotel menggunakan bubble sort
        hotelService.bubbleSortHarga();
        

        // Tampilkan data hotel setelah diurutkan
        System.out.println("\nDaftar Harga Hotel setelah diurutkan dengan bubble sort:");
        hotelService.tampil();
        
        hotelService.selectionSortHarga();
        

        // Tampilkan data hotel setelah diurutkan
        System.out.println("\nDaftar Harga Hotel setelah diurutkan dengan selection sort:");
        hotelService.tampil();

        // Urutkan data hotel menggunakan selection sort
        hotelService.selectionSort();

        // Tampilkan data hotel setelah diurutkan kembali
        System.out.println("\nDaftar Bintang Hotel setelah diurutkan dengan selection sort:");
        hotelService.tampil();


        hotelService.bubbleSortBintang();

        // Tampilkan data hotel setelah diurutkan kembali
        System.out.println("\nDaftar Bintang Hotel setelah diurutkan dengan Bubble sort:");
        hotelService.tampil();
    }
}
    

