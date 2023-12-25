import dsa.*;

public class App {
    public static void main(String[] args) throws Exception {
        BinSearchTree bst = new BinSearchTree();
        bst.insert(7);
        bst.insert(4);
        bst.insert(3);
        bst.insert(5);
        bst.insert(10);
        bst.insert(9);
        bst.insert(11);
        bst.insert(1);
        bst.display();
        // System.out.println(bst.SumOfRight());
        System.out.println(bst.ProductOf2(5,3));
        
    }
}