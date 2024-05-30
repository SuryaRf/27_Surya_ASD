// package Jobsheet14;

// public class GraphMatriks27 {
//     int vertex;
//     int[][] matriks;

//     public GraphMatriks27(int v) {
//         vertex = v;
//         matriks = new int[v][v];

//         for (int i = 0; i < v; i++) {
//             for (int j = 0; j < v; j++) {
//                 matriks[i][j] = -1;
//             }
//         }
//     }

//     public void makeEdge(int asal, int tujuan, int jarak) {
//         matriks[asal][tujuan] = jarak;
//     }

//     public void removeEdge(int asal, int tujuan) {
//         matriks[asal][tujuan] = 0;
//     }

//     public void printGraph() {
//         for (int i = 0; i < vertex; i++) {
//             System.out.print("Gedung " + (char) ('A' + i) + ": ");
//             for (int j = 0; j < vertex; j++) {
//                 if (matriks[i][j] != -1) {
//                     System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + "m), ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public int getInDegree(int node) {
//         int inDegree = 0;
//         for (int i = 0; i < vertex; i++) {
//             if (matriks[i][node] != -1) {
//                 inDegree++;
//             }
//         }
//         return inDegree;
//     }

//     public int getOutDegree(int node) {
//         int outDegree = 0;
//         for (int i = 0; i < vertex; i++) {
//             if (matriks[node][i] != -1) {
//                 outDegree++;
//             }
//         }
//         return outDegree;
//     }

//     public int getTotalDegree(int node) {
//         return getInDegree(node) + getOutDegree(node);
//     }

//     public void printDegrees() {
//         for (int i = 0; i < vertex; i++) {
//             System.out.println("Gedung " + (char) ('A' + i) + ": ");
//             System.out.println("InDegree: " + getInDegree(i));
//             System.out.println("OutDegree: " + getOutDegree(i));
//             System.out.println("TotalDegree: " + getTotalDegree(i));
//             System.out.println();
//         }
//     }
// }


package Jobsheet14;

public class GraphMatriks27 {
    int vertex;
    int[][] matriks;

    public GraphMatriks27(int v) {
        vertex = v;
        matriks = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = -1;
            }
        }
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + "m), ");
                }
            }
            System.out.println();
        }
    }

    public int getInDegree(int node) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != -1) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public int getOutDegree(int node) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[node][i] != -1) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public int getTotalDegree(int node) {
        return getInDegree(node) + getOutDegree(node);
    }

    public void printDegrees() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + ": ");
            System.out.println("InDegree: " + getInDegree(i));
            System.out.println("OutDegree: " + getOutDegree(i));
            System.out.println("TotalDegree: " + getTotalDegree(i));
            System.out.println();
        }
    }

    public boolean isAdjacent(int node1, int node2) {
        return matriks[node1][node2] != -1;
    }
}
