package Jobsheet14;

// public class Graph27 {
//     int vertex;
//     doubleLinkedList27 list[];

//     public Graph27(int v) {
//         vertex = v;
//         list = new doubleLinkedList27[v];
//         for (int i = 0; i < v; i++) {
//             list[i] = new doubleLinkedList27();
//         }
//     }

//     public void addEdge(int asal, int tujuan, int jarak) {
//         list[asal].addFirst(tujuan, jarak);
//         // list[asal].addFirst(asal, jarak);
//     }

//     public void degree(int asal) {
//         int k, totalIn = 0, totalOut = 0;
//         for (int i = 0; i < vertex; i++) {
//             // inDegree
//             for (int j = 0; j < list[i].size(); j++) {
//                 if (list[i].get(j) == asal) {
//                     ++totalIn;
//                 }
//             }
//             // outDegree
//             for (k = 0; k < list[asal].size(); k++) {
//                 list[asal].get(k);
//             }
//             totalOut = k;
//         }
//         System.out.println("InDegree dari Gedung : " + (char) ('A' + asal) + " : " + totalIn);
//         System.out.println("OutDegree dari Gedung : " + (char) ('A' + asal) + " : " + totalOut);
//         System.out.println("Degree dari Gedung : " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
//         System.out.println("Degree dari Gedung : " + (char) ('A' + asal) + " : " + list[asal].size());
//     }

//     public void removeEdge(int asal, int tujuan) {
//         for (int i = 0; i < vertex; i++) {
//             if (i == tujuan) {
//                 list[asal].remove(tujuan);
//             }
//         }
//     }

//     public void removeAllEdges(){
//         for (int i = 0; i < vertex; i++) {
//             list[i].clear();
//         }
//         System.out.println("Graf berhasil dikosongkan");
//     }

//     public void printGraph() {
//         for (int i = 0; i < vertex; i++) {
//             if (list[i].size() > 0) {
//                 System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
//                 for (int j = 0; j < list[i].size(); j++) {
//                     try {
//                         System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
//                     } catch (Exception e) {
//                         System.err.println("Error retrieving edge information: " + e.getMessage());
//                     }
//                 }
//                 System.out.println("");
//             }
//         }
//         System.out.println("");
//     }
    
// }


import java.util.Scanner;

public class Graph27 {
    int vertex;
    doubleLinkedList27 list[];

    public Graph27(int v) {
        vertex = v;
        list = new doubleLinkedList27[v];
        for (int i = 0; i < v; i++) {
            list[i] = new doubleLinkedList27();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // tambahkan edge dari tujuan ke asal jika diperlukan
        // list[tujuan].addFirst(asal, jarak);
    }

    public boolean isAdjacent(int asal, int tujuan) {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }

    public void degree(int asal) {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung : " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung : " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung : " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
        System.out.println("Degree dari Gedung : " + (char) ('A' + asal) + " : " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    try {
                        System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                    } catch (Exception e) {
                        System.err.println("Error retrieving edge information: " + e.getMessage());
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void updateJarak(int asal, int tujuan, int jarakBaru) {
        list[asal].updateJarak(tujuan, jarakBaru);
    }

    public int hitungEdge() {
        int totalEdge = 0;
        for (int i = 0; i < vertex; i++) {
            totalEdge += list[i].size();
        }
        return totalEdge;
    }
    
    
    
}