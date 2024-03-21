package Minggu5;

public class Main27 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi27 list = new DaftarMahasiswaBerprestasi27();
        Mahasiswa27 m1 = new Mahasiswa27("Apiq", 2020, 23, 4);
        Mahasiswa27 m2 = new Mahasiswa27("Agus", 2023, 27, 2);
        Mahasiswa27 m3 = new Mahasiswa27("Zurya", 2020, 22, 3);
        Mahasiswa27 m4 = new Mahasiswa27("Faza", 2020, 28, 3.75);
        Mahasiswa27 m5 = new Mahasiswa27("Satria", 2020, 27, 2.80);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();


        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk = ");
        list.bubbleSort();
        list.tampil();


        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk = ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk  menggunakan insertion sort = ");
        list.insertionSort();
        list.tampil();
    }
}
