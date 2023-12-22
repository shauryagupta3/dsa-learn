package dsa;

class Node {
    int value;
    int height;
    Node left, right;

    Node(int el) {
        value = el;
        height = 1;
        left = right = null;
    }
}

public class AVLTree {
    private Node root;

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private Node insert(Node node, int el) {
        if (node == null) {
            return new Node(el);
        } else if (node.value > el) {
            node.left = insert(node.left, el);
        } else if (node.value < el) {
            node.right = insert(node.right, el);
        } else {
            System.out.println("unable to add node");
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) { // left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                // left left
                return rightRotate(node);
            } else if (height(node.left.left) - height(node.left.right) < 0) {
                // left right
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        } else if (height(node.left) - height(node.right) < 1) { // right heavy
            if (height(node.right.right) - height(node.right.left) > 0) {
                // right right
                return leftRotate(node);
            } else if (height(node.right.right) - height(node.right.left) < 0) {
                // left right
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node node) {
        Node child = node.left;
        node.left = child.right;

        child.right = node;
        return child;
    }

    private Node leftRotate(Node node) {
        Node child = node.right;
        node.right = child.left;

        child.left = node;
        return child;
    }

    private void display(Node node, int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|---->" + node.value + " h-" + node.height);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }

    private boolean search(Node node, int el) {
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

    public AVLTree() {
        root = null;
    }

    public void display() {
        display(root, 0);
    }

    public void insert(int el) {
        root = insert(root, el);
    }

    public void search(int el) {
        System.out.println(search(root, el));
    }
}
