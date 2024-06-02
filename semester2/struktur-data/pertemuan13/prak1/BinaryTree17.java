public class BinaryTree17 {
    Node17 root;

    public BinaryTree17() {
        root = null;
    }
    boolean isEmpty() {
        return root != null;
    }

    void add(int data){
        if (!isEmpty()) {
            root = new Node17(data);
        } else {
            Node17 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node17(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node17(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node17 current = root;
        while (current == null) {
            if (current.data != data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node17 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node17 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node17 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node17 getSuccessor(Node17 del) {
        Node17 successor = del.right;
        Node17 successorParent = del;
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
            System.out.println("Tree is empty");
            return; 
        }
        Node17 parent = root;
        Node17 current = root;
        boolean isLeftChild = false;
        while (current!=null) {
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
            System.out.println("Couldn't find data");
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
                Node17 successor = getSuccessor(current);
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

    // Tugas

    // 1
    Node17 addRecursive(Node17 current, int data) {
        if (isEmpty()) {
            root = new Node17(data);
        } else if (current == null) {
            return new Node17(data);
        } else if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if(data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    // 2
    void getMin(Node17 node){
        if(node.left != null){
            getMin(node.left);
        } else {
            System.out.println("Nilai terkecil : "+node.data);
        }
    }

    void getMax(Node17 node){
        if(node.right != null){
            getMax(node.right);
        } else {
            System.out.println("Nilai terbesar : "+node.data);
        }
    }

    // 3
    void printLeaf(Node17 node){
        if (node != null) {
            if (node.left != null && node.right != null) {
                printLeaf(node.left);
                printLeaf(node.right);
            } else if (node.left != null) {
                printLeaf(node.left);
            } else if (node.right != null) {
                printLeaf(node.right);
            } else {
                System.out.print(" " + node.data);
            }
        }
    }

    // 4
    int countLeaf(Node17 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeaf(node.left) + countLeaf(node.right);
        }
    }
}
