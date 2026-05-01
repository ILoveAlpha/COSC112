public class BSTNode<V> {
    private V value;
    public BSTNode<V> left;
    public BSTNode<V> right;
    
    public BSTNode(V value){
        this.value = value;
        this.left = null;   
        this.right = null;
    }

    public V getValue() {
        return value;
    }
}