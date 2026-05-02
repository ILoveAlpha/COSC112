public class BinarySearchTree<V extends Comparable<V>> {
    private BSTNode<V> _root;

    public BinarySearchTree () {
        _root = null;
    }


    // Insert key-value pair into the BST. The key should be the array index for each respective value.
    // Hint: You may want to create a private helper method that takes a node as a parameter.
    public void add(int key, V value) {
        _root = add(_root, key, value);
    }

    private BSTNode<V> add(BSTNode<V> node, int key, V value) {
        if (node == null) return new BSTNode<V>(key, value);

        int compareV = value.compareTo(node.getValue());

        if (compareV < 0) node.left = add(node.left, key, value);

        else if (compareV == 0 || compareV > 0) node.right = add(node.right, key, value);

        return node;
    }

    // This should preform inorder traversal using the InOrderTraverse(BSTNode<V> node) helper method.
    public void InOrderTraverse() {
        InOrderTraverse(_root);
    }

    // This should be the recursive inorder traversal method.
    // Hint: Print keys in sorted order using inorder traversal.
    private void InOrderTraverse(BSTNode<V> node) {
        if (node == null) return;

        InOrderTraverse(node.left);

        System.out.println("(" + node.key + ", " + node.value + ")");

        InOrderTraverse(node.right);
    }

    // Returns the height of the tree.
    // Height = number of edges in the longest path from root to a leaf.
    // An empty tree should return -1.
    public int height() {
        return height(_root);
    }

    private int height(BSTNode<V> node) {
        if (node == null) return -1;

        int left = height(node.left);
        int right = height(node.right);

        return 1 + Math.max(left, right);
    }

    // Return key if the value exists in the tree, -1 otherwise.
    public int search(V value) {
        BSTNode<V> cur = _root;

        while (cur != null) {
            int compareV = value.compareTo(cur.value);

            if (compareV == 0) return cur.key;

            else if (compareV < 0) cur = cur.left;

            else cur = cur.right;
        }       
        
        return -1;
    }
}
