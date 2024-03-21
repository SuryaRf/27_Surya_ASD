package Minggu5;

public class DaftarMahasiswaBerprestasi27 {
    Mahasiswa27[] listMhs = new Mahasiswa27[5];
    int idx;

    void tambah(Mahasiswa27 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }

    }
    void tampil(){
        for (Mahasiswa27 m : listMhs) {
            m.tampil();
            System.out.println("======================================");

        }
    }
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa27 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa27 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // void insertionSort() {
    //     for (int i = 1; i < listMhs.length; i++) {
    //         Mahasiswa27 temp = listMhs[i];
    //         int j = i;
    //         while (j > 0 && listMhs[j-1].ipk < temp.ipk) { // Ubah kondisi menjadi listMhs[j-1].ipk < temp.ipk
    //             listMhs[j] = listMhs[j-1];
    //             j--;
    //         }
    //         listMhs[j] = temp;
    //     }
    // } //MODIF TO DESC
    
    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa27 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk >  temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
