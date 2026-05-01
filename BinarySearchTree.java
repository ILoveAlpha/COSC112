public class BinarySearchTree<V> {
    private BSTNode<V> _root;

    public BinarySearchTree () {
        _root = null;
    }


    // Insert key-value pair into the BST. The key should be the array index for each respective value.
    // Hint: You may want to create a private helper method that takes a node as a parameter.
    public void add(int key, V value) {

    }

    // This should preform inorder traversal using the InOrderTraverse(BSTNode<V> node) helper method.
    public void InOrderTraverse() {
        InOrderTraverse(_root);
        System.out.println();
    }

    // This should be the recursive inorder traversal method.
    // Hint: Print keys in sorted order using inorder traversal.
    private void InOrderTraverse(BSTNode<V> node) {

    }

    // Returns the height of the tree.
    // Height = number of edges in the longest path from root to a leaf.
    // An empty tree should return -1.
    public int height() {

    }

    // Searches for a key in the BST.
    // Return value if the key exists in the tree, null otherwise.
    public V search(int key) {

    }

    // Return key if the value exists in the tree, null otherwise.
    public int search(V value) {

    }
}