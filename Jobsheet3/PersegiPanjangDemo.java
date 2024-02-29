public class PersegiPanjangDemo {
    
    public static void main(String[] args) {
        PersegiPanjang27[] arrayoOfPersegiPanjang = new PersegiPanjang27[3];
        arrayoOfPersegiPanjang[0] = new PersegiPanjang27();
        arrayoOfPersegiPanjang[0].panjang = 110;
        arrayoOfPersegiPanjang[0].lebar = 30;

        arrayoOfPersegiPanjang[1] = new PersegiPanjang27();
        arrayoOfPersegiPanjang[1].panjang = 80;
        arrayoOfPersegiPanjang[1].lebar = 40;

        arrayoOfPersegiPanjang[2] = new PersegiPanjang27();
        arrayoOfPersegiPanjang[2].panjang = 100;
        arrayoOfPersegiPanjang[2].lebar = 20;

        System.out.println("Persegi panjang ke-1, panjang: " + arrayoOfPersegiPanjang[0].panjang 
        + ", lebar: " + arrayoOfPersegiPanjang[0].lebar);
        System.out.println("Persegi panjang ke-1, panjang: " + arrayoOfPersegiPanjang[1].panjang 
        + ", lebar: " + arrayoOfPersegiPanjang[1].lebar);
        System.out.println("Persegi panjang ke-1, panjang: " + arrayoOfPersegiPanjang[2].panjang 
        + ", lebar: " + arrayoOfPersegiPanjang[2].lebar);
    }
}
