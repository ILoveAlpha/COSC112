public class BSTNode<V> {
    private int key;
    private V value;
    BSTNode<V> left;
    BSTNode<V> right;
    
    public BSTNode(int key, V value){
        this.key = key;
        this.value = value;
        this.left = null;   
        this.right = null;
    }
    
    public int getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(int newKey) {
        key = newKey;
    }

    public void setValue(V newValue) {
        value = newValue;
    }
}
