// package Jobsheet13;

// public class BinaryTreeArray27 {
//     int[] data;
//     int idxLast;

//     public BinaryTreeArray27(){
//         data = new int[10];
//     }

//     void populateData(int[] data, int idxLast){
//         this.data = data;
//         this.idxLast = idxLast;
//     }

//     void transverseInOrder(int idxStart){
//         if (idxStart <= idxLast) {
//             transverseInOrder(2*idxStart +1);
//             System.out.print(data[idxStart] + " ");
//             transverseInOrder(2 *idxStart + 2);
//         }
//     }
// }

//Jawaban Tugas Praktikum Nomer 5
package Jobsheet13;

public class BinaryTreeArray27 {
    int[] data;
    int idxLast;

    public BinaryTreeArray27() {
        data = new int[10]; // Default size
        idxLast = -1;
    }

    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void add(int data) {
        if (idxLast == this.data.length - 1) {
            System.out.println("Tree is full!");
            return;
        }
        this.data[++idxLast] = data;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
