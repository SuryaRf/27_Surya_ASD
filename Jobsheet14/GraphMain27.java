package Jobsheet14;
import java.util.Scanner;

//TUGAS PRAKTIKUM 2
public class GraphMain27 {
    // public static void main(String[] args) {
    //     Graph27 gedung = new Graph27(6);
    
    //     gedung.addEdge(0, 1, 50);
    //     gedung.addEdge(0, 2, 100);
    //     gedung.addEdge(1, 3, 70);
    //     gedung.addEdge(2, 3, 40);
    //     gedung.addEdge(3, 4, 60);
    //     gedung.addEdge(4, 5, 80);
        
    //     System.out.println("Graf sebelum perubahan jarak:");
    //     gedung.printGraph();
        
    //     // Mengubah jarak antara node 0 dan 1 menjadi 80
    //     gedung.updateJarak(0, 1, 80);
    //     gedung.updateJarak(0, 2, 30);
    //     gedung.updateJarak(1, 3, 50);
    //     gedung.updateJarak(2, 3, 20);
    //     gedung.updateJarak(3, 4, 50);
    //     gedung.updateJarak(4, 5, 20);
        
    //     System.out.println("Graf setelah perubahan jarak:");
    //     gedung.printGraph();

    //     System.out.println("Jumlah edge dalam graf: " + gedung.hitungEdge());
    // }
    



// public class GraphMain27 {

//         public static void main(String[] args) {
//             GraphMatriks27 gdg = new GraphMatriks27(4);
//         gdg.makeEdge(0, 1, 50);
//         gdg.makeEdge(1, 0, 60);
//         gdg.makeEdge(1, 2, 70);
//         gdg.makeEdge(2, 1, 80);
//         gdg.makeEdge(2, 3, 40);
//         gdg.makeEdge(3, 0, 90);

//         System.out.println("");
//         System.out.println("Graf awal:");
//         System.out.println("");
//         gdg.printGraph();
        
//         System.out.println("");
//         System.out.println("Derajat setiap gedung:");
//         System.out.println("");
//         gdg.printDegrees();
        
//         System.out.println("");
//         System.out.println("Hasil setelah penghapusan edge:");
//         System.out.println("");
//         gdg.removeEdge(2, 1);
//         gdg.printGraph();
        
//         System.out.println("");
//         System.out.println("Derajat setiap gedung setelah penghapusan edge:");
//         System.out.println("");
//         gdg.printDegrees();
//         }



//SOAL PRAKTIKUM
// package Jobsheet14;

// import java.util.Scanner;

// public class GraphMain27 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Masukkan jumlah vertex: ");
//         int vertex = scanner.nextInt();
//         GraphMatriks27 graph = new GraphMatriks27(vertex);

//         while (true) {
//             System.out.println("+--------------------+");
//             System.out.println("|       Menu         |");
//             System.out.println("+--------------------+");
//             System.out.println("| 1. Add Edge        |");
//             System.out.println("| 2. Remove Edge     |");
//             System.out.println("| 3. Degree          |");
//             System.out.println("| 4. Print Graph     |");
//             System.out.println("| 5. Cek Edge        |");
//             System.out.println("| 6. Exit            |");
//             System.out.println("+--------------------+");
//             System.out.print("Pilih menu: ");
//             int choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Masukkan asal: ");
//                     int asal = scanner.nextInt();
//                     System.out.print("Masukkan tujuan: ");
//                     int tujuan = scanner.nextInt();
//                     System.out.print("Masukkan jarak: ");
//                     int jarak = scanner.nextInt();
//                     graph.makeEdge(asal, tujuan, jarak);
//                     break;
//                 case 2:
//                     System.out.print("Masukkan asal: ");
//                     asal = scanner.nextInt();
//                     System.out.print("Masukkan tujuan: ");
//                     tujuan = scanner.nextInt();
//                     graph.removeEdge(asal, tujuan);
//                     break;
//                 case 3:
//                     System.out.print("Masukkan node: ");
//                     int node = scanner.nextInt();
//                     System.out.println("InDegree dari node " + (char) ('A' + node) + ": " + graph.getInDegree(node));
//                     System.out.println("OutDegree dari node " + (char) ('A' + node) + ": " + graph.getOutDegree(node));
//                     System.out.println("TotalDegree dari node " + (char) ('A' + node) + ": " + graph.getTotalDegree(node));
//                     break;
//                 case 4:
//                     graph.printGraph();
//                     break;
//                 case 5:
//                     System.out.print("Masukkan node1: ");
//                     int node1 = scanner.nextInt();
//                     System.out.print("Masukkan node2: ");
//                     int node2 = scanner.nextInt();
//                     if (graph.isAdjacent(node1, node2)) {
//                         System.out.println("Gedung " + (char) ('A' + node1) + " dan Gedung " + (char) ('A' + node2) + " bertetangga.");
//                     } else {
//                         System.out.println("Gedung " + (char) ('A' + node1) + " dan Gedung " + (char) ('A' + node2) + " tidak bertetangga.");
//                     }
//                     break;
//                 case 6:
//                 System.out.println("\u001B[31mKeluar dari program.\u001B[0m");
//                     scanner.close();
//                     return;
//                 default:
//                     System.out.println("Pilihan tidak valid. Silakan coba lagi.");
//                     break;
//             }
//         }
//     }
// }







    // // praktikum 1
    // public static void main(String[] args) {
    //     Graph27 gedung = new Graph27(6);

    //     gedung.addEdge(0, 1, 50);
    //     gedung.addEdge(0, 2, 100);
    //     gedung.addEdge(1, 3, 70);
    //     gedung.addEdge(2, 3, 40);
    //     gedung.addEdge(3, 4, 60);
    //     gedung.addEdge(4, 5, 80);
    //     gedung.degree(0);
    //     gedung.printGraph();

    //     gedung.removeEdge(1, 3);
    //     gedung.printGraph();
    // }


//     // PERTANYAAN PRAKTIKUM 1
    public static void main(String[] args) {
        Graph27 gedung = new Graph27(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gedung asal: ");
        int node1 = scanner.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int node2 = scanner.nextInt();

        if (gedung.isAdjacent(node1, node2)) {
            System.out.println("\u001B[32mGedung " + (char) ('A' + node1) + " dan Gedung " + (char) ('A' + node2) + " bertetangga.\u001B[0m");

        } else {
            System.out.println("\u001B[31mGedung " + (char) ('A' + node1) + " dan Gedung " + (char) ('A' + node2) + " tidak bertetangga.\u001B[0m");

        }

        scanner.close();
    }

// }
}

