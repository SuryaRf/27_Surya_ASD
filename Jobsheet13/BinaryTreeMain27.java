package Jobsheet13;

public class BinaryTreeMain27 {
    public static void main(String[] args) {
        BinaryTree27 bt = new BinaryTree27();
        // bt.add(6);
        // bt.add(4);
        // bt.add(8);
        // bt.add(3);
        // bt.add(5);
        // bt.add(7);
        // bt.add(9);
        // bt.add(10);
        // bt.add(15);

        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal : ");
        bt.transverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        // Memanggil metode untuk menemukan nilai paling kecil dan paling besar
        int minValue = bt.findMinValue();
        int maxValue = bt.findMaxValue();

        System.out.println("Nilai paling kecil dalam pohon: " + minValue);
        System.out.println("Nilai paling besar dalam pohon: " + maxValue);

          // Memanggil metode untuk menampilkan leaf nodes
          System.out.print("Leaf Nodes: ");
          bt.printLeafNodes(bt.root);
          System.out.println("");

          
          // Memanggil metode untuk menghitung jumlah leaf nodes
          int leafCount = bt.countLeafNodes(bt.root);
          System.out.println("Jumlah Leaf Nodes: " + leafCount);
    }


  
}
