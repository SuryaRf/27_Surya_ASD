import java.util.Scanner;

import BruteForceDivideConquer.minggu5.Latihan27;

public class LatihanMain27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("        Perhitungan Akar");
        System.out.println("==================================");
        System.out.print("Masukkan bilangan: ");
        double number = scanner.nextDouble();
        Latihan27 latihan = new Latihan27();
        
        // Brute Force
        double bruteResult = latihan.bruteForceSqrt(number);
        System.out.println("==================================");
        System.out.println("Nilai akar dari  " + number + " adalah: " + bruteResult + " Dengan menggunakan Brute Force");
        System.out.println("==================================");
        
        // Divide Conquer
        double divideConquerResult = latihan.divideConquerSqrt(number);
        System.out.println("Nilai akar dari " + number + " adalah: " + divideConquerResult + " Dengan menggunakan Divide Conquer");
        System.out.println("==================================");

        scanner.close();
    }
}
