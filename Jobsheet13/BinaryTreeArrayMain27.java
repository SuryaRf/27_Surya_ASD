// package Jobsheet13;

// public class BinaryTreeArrayMain27 {
//     public static void main(String[] args) {
//         BinaryTreeArray27 bta = new BinaryTreeArray27();

//         int[] data = {6,4,8,3,5,7,9,0,0,0};
//         int idxLast = 6;
//         bta.populateData(data, idxLast);
//         System.out.print("\nInOrder Traversal : ");
//         bta.transverseInOrder(0);
//         System.out.println("\n");
//     }
// }


package Jobsheet13;

public class BinaryTreeArrayMain27 {
    public static void main(String[] args) {
        BinaryTreeArray27 bta = new BinaryTreeArray27();

        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        
        System.out.print("InOrder Traversal: ");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.print("PreOrder Traversal: ");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.print("PostOrder Traversal: ");
        bta.traversePostOrder(0);
        System.out.println();
        
        // Adding new data to the tree
        bta.add(10);
        bta.add(2);
        
        System.out.println("");
        System.out.print("InOrder Traversal Setelah adding: ");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.print("PreOrder Traversal Setelah adding: ");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.print("PostOrder Traversal Setelah adding: ");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
