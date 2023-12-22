import dsa.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        AVLTree avl = new AVLTree();
        avl.insert(2);
        avl.insert(6);
        avl.insert(3);
        avl.search(6);
        avl.search(60);
        avl.search(3);
        avl.display();
    }
}