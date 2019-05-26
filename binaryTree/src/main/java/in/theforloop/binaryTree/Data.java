package in.theforloop.binaryTree;

/**
 * @author Shubham
 */
public class Data {
    private int key;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Data(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                '}';
    }
}
