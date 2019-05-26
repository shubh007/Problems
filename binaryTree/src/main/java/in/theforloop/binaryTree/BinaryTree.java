package in.theforloop.binaryTree;

/**
 * @author Shubham
 */
public class BinaryTree {

    private BNode root;

    public BinaryTree(BNode root) {
        this.root = root;
    }
    public BinaryTree(Data data) {
        this.root = new BNode(data);
    }
    public BinaryTree() {
        this.root = null;
    }

    public BNode getRoot() {
        return root;
    }

    public void setRoot(BNode root) {
        this.root = root;
    }


}
