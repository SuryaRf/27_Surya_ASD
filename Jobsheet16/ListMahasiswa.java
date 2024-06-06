// package Jobsheet16;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;

// public class ListMahasiswa {
//     List<Mahasiswa> mahasiswas = new ArrayList<>();

//     public void tambah(Mahasiswa... mahasiswa){
//         mahasiswas.addAll(Arrays.asList(mahasiswa));
//     }

//     public void hapus (int index){
//         mahasiswas.remove(index);
//     }


//     public void update (int index, Mahasiswa mhs){
//         mahasiswas.set(index, mhs);
//     }

//     public void tampil(){
//         mahasiswas.stream().forEach(mhs -> {
//             System.out.println("" + mhs.toString());
//         });
//     }

//     int linearSearch (String nim){
//         for (int i = 0; i < mahasiswas.size(); i++) {
//             if (nim.equals(mahasiswas.get(i).nim)) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         ListMahasiswa lm = new ListMahasiswa();

//         Mahasiswa m =  new Mahasiswa("201234 ", "Noureen ", "021xx1 ");
//         Mahasiswa m1 =  new Mahasiswa("201235 ", "Akhleema ", "021xx2 ");
//         Mahasiswa m2=  new Mahasiswa("201236 ", "Shannum ", "021xx3 ");
   
//         lm.tambah(m, m1, m2);

//         lm.tampil();

//         lm.update(lm.linearSearch("201235 "), new Mahasiswa("201235 ", "Akhleema Lela ", "021xx2"));
//         System.out.println("");
//         lm.tampil();
   
//     }


// }


package Jobsheet16;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ListMahasiswa {
    List<Mahasiswa1> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa1... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus (int index){
        mahasiswas.remove(index);
    }


    public void update (int index, Mahasiswa1 mhs){
        mahasiswas.set(index, mhs);
    }

    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int binarySearch(String nim){
        // Pastikan list terurut berdasarkan NIM
        Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));
        // Lakukan pencarian biner
        int index = Collections.binarySearch(mahasiswas, new Mahasiswa1(nim, "", ""));
        return index >= 0 ? index : -1;
    }
// Fungsi sorting secara ascending
void sortAscending() {
    Collections.sort(mahasiswas);
}

// Fungsi sorting secara descending
void sortDescending() {
    Collections.sort(mahasiswas, Collections.reverseOrder());
}

public static void main(String[] args) {
    ListMahasiswa lm = new ListMahasiswa();

    Mahasiswa1 m =  new Mahasiswa1("201234", "Noureen", "021xx1");
    Mahasiswa1 m1 =  new Mahasiswa1("201235", "Akhleema", "021xx2");
    Mahasiswa1 m2 =  new Mahasiswa1("201236", "Shannum", "021xx3");

    lm.tambah(m, m1, m2);

    lm.tampil();

    lm.update(lm.binarySearch("201235"), new Mahasiswa1("201235", "Akhleema Lela", "021xx2"));
    System.out.println("");
    lm.tampil();

    System.out.println("\nSorting Ascending:");
    lm.sortAscending();
    lm.tampil();

    System.out.println("\nSorting Descending:");
    lm.sortDescending();
    lm.tampil();
}
}
