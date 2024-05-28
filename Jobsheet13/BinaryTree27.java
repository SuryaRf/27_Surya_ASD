package Jobsheet13;

public class BinaryTree27 {
    Node27 root;

    public BinaryTree27() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node27(data);
        } else {
            Node27 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node27(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node27(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else { // data already exists, do nothing
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        Node27 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(Node27 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node27 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void transverseInOrder(Node27 node) {
        if (node != null) {
            transverseInOrder(node.left);
            System.out.print(" " + node.data);
            transverseInOrder(node.right);
        }
    }

    Node27 getSuccessor(Node27 del) {
        Node27 successor = del.right;
        Node27 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node27 parent = root;
        Node27 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }

        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node27 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    // Metode untuk menambahkan node dengan cara rekursif
    void addRecursive(int data) {
        root = addRecursiveHelper(root, data);
    }

    // Helper method rekursif untuk menambahkan node
    private Node27 addRecursiveHelper(Node27 current, int data) {
        if (current == null) {
            return new Node27(data);
        }

        if (data < current.data) {
            current.left = addRecursiveHelper(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursiveHelper(current.right, data);
        } // else, data sudah ada, tidak perlu menambahkan apa-apa

        return current;
    }

    // Metode untuk mencari nilai paling kecil dalam pohon biner
    int findMinValue() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return Integer.MIN_VALUE;
        }
        Node27 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // Metode untuk mencari nilai paling besar dalam pohon biner
    int findMaxValue() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return Integer.MAX_VALUE;
        }
        Node27 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

     // Method untuk menampilkan data di leaf nodes
     void printLeafNodes(Node27 node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        } else {
            printLeafNodes(node.left);
            printLeafNodes(node.right);
        }
    }
      // Method untuk menghitung jumlah leaf nodes
      int countLeafNodes(Node27 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeafNodes(node.left) + countLeafNodes(node.right);
        }
    }
}

