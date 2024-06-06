package Jobsheet16;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ContohList {
    public static void main(String[] args) {


        //MODIFIKASI NOMER 2 PRAKTIKUM 1
        // List<Integer> l = new ArrayList<>();
        // l.add(1); // Menambahkan Integer
        // l.add(2); // Menambahkan Integer
        // l.add(3); // Menambahkan Integer
        
        // // Cetakan akan menghasilkan error karena "Cireng" adalah String
        // // l.add("Cireng"); // Ini akan menyebabkan error kompilasi

        // // Mencetak elemen dalam daftar
        // System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d%n",
        //     l.get(0), l.size(), l.get(l.size() - 1));

        // l.add(4); // Menambahkan Integer lagi
        // l.remove(0); // Menghapus elemen pertama
        // System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d%n",
        //     l.get(0), l.size(), l.get(l.size() - 1));

        List<Object> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s%n",
            l.get(0), l.size(), l.get(l.size() - 1));

        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s%n",
            l.get(0), l.size(), l.get(l.size() - 1));


        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        
        names.push("Mei-Mei");
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s%n",
        names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());


       
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s%n",
            names.get(0), names.size(), names.get(names.size() - 1));

        names.set(0, "My kid");
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s%n",
            names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());
    }
}
