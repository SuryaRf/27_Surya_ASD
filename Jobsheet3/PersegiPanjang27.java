/**
 * PersegiPanjang27
 */
public class PersegiPanjang27 {

    public int panjang;
    public int lebar;

    public  PersegiPanjang27(){
        
    }

    public PersegiPanjang27(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public void cetakInfo() {
        System.out.println(" Panjang: " + panjang + ", Lebar: " + lebar);
    }


    
    // Method untuk menghitung luas persegi panjang
    public int hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling persegi panjang
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}



    
   
