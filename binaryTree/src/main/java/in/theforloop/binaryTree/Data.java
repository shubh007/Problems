package in.theforloop.binaryTree;

/**
 * @author Shubham
 */
public class Data {
    private Integer key;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Data(Integer key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                '}';
    }
}
