package dsa;

class BSTNode {
    int value;
    BSTNode left, right;

    BSTNode(int el) {
        this.value = el;
        left = right = null;
    }
}

public class BinSearchTree {
    private BSTNode root;

    private BSTNode insert(BSTNode node, int el) {
        if (node == null) {
            return new BSTNode(el);
        } else if (node.value > el) {
            node.left = insert(node.left, el);
        } else if (node.value < el) {
            node.right = insert(node.right, el);
        } else {
            System.out.println("unable to add node");
        }
        return node;
    }

    private void display(BSTNode node, int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|---->" + node.value);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }

    private boolean search(BSTNode node, int el) {
        if (node == null) {
            return false;
        } else if (node.value == el) {
            return true;
        } else if (node.value > el) {
            return search(node.left, el);
        } else if (node.value < el) {
            return search(node.right, el);
        }
        return false;
    }

    private int sumOfRight(BSTNode node, int val) {
        if (node == null) {
            return val;
        }
        int rSum, lSum;
        lSum = sumOfRight(node.left, 0);
        if (node.right != null) {
            rSum = sumOfRight(node.right, 1);
        } else {
            rSum = sumOfRight(node.right, 0);
        }
        return val + rSum + lSum;
    }

    public BinSearchTree() {
        root = null;
    }

    public void display() {
        display(root, 0);
    }

    public int ProductOf2(int x,int y){
        if (y==0) {
            return 0;
        }
        return x + ProductOf2(x,y-1);
    }

    public void insert(int el) {
        root = insert(root, el);
    }

    public int SumOfRight() {
        return sumOfRight(root, 0);
    }

    public void search(int el) {
        System.out.println(search(root, el));
    }
}
