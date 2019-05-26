package in.theforloop.binaryTree;

/**
 * @author Shubham
 */
public class BNode {
    private Data data;
    private BNode left;
    private BNode right;

    public BNode(Data data) {
        this.data = data;
        left = null;
        right = null;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public BNode getLeft() {
        return left;
    }

    public void setLeft(BNode left) {
        this.left = left;
    }

    public BNode getRight() {
        return right;
    }

    public void setRight(BNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
