package data_structures.trees_graphs.linkedlist;

public class Tree {
    Node root;

    public void addNode(int data){
        addNode(root, data);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void addNode(Node n, int data){
        if (n == null){
            n = new Node(data);
        }

        if (data < n.data){
            if (n.left == null)
                n.left = new Node(data);
            else
                addNode(n.left, data);
        }

        if (data > n.data){
            if (n.right == null)
                n.right = new Node(data);
            else
                addNode(n.right, data);
        }
    }

    private void inOrder(Node n){
        if (n == null){
            return;
        }

        if (n.left != null)
            inOrder(n.left);
        System.out.println("Order ID: " + n.data);

        if (n.right != null)
            inOrder(n.right);
    }
    
}
