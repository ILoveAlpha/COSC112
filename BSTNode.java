public class BSTNode<V> {
    int key;
    V value;
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
}
