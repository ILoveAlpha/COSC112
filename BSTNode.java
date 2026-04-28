public class BSTNode<V> {
    private int key;
    private V value;
    public BSTNode<V> left;
    public BSTNode<V> right;
    
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
}