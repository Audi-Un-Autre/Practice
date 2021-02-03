package data_structures.trees_graphs.linkedlist;

public class Tree {
    Node root;

    public void addNode(int data){
        addNode(root, data);
    }

    public void deleteNode(int data){
        deleteNode(root, data);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void addNode(Node n, int data){
        if (n == null){
            n = new Node(data);
        }

        if (data < n.data){
            if (n.left == null){
                n.left = new Node(data);
                n.left.parent = n;
            }
            else
                addNode(n.left, data);
        }

        if (data > n.data){
            if (n.right == null){
                n.right = new Node(data);
                n.right.parent = n;
            }
            else
                addNode(n.right, data);
        }
    }

    private void deleteNode(Node n, int data){
        if (n == null) return;

        if (data < n.data){
            if (n.left != null){
                deleteNode(n.left, data);
            }
        }

        else if (data > n.data){
            if (n.right != null){
                deleteNode(n.right, data);
            }
        }

        else{
            if (n.left != null && n.right != null){ // 2 children, find min value node in right descendents
                Node minNode = n.right;
                Node current = n.right;

                while(current.right != null){ // look for min value in right descendant
                    if (current.right.data < current.data)
                        minNode = current.right;
                    current = current.right;
                }

                n.data = minNode.data;
                deleteNode(n.right, minNode.data); // recurse through the min value node
            }

            else if (n.left != null){ // 1 child
                if (n.parent.right == n)
                    n.parent.right = n.left;
                else
                    n.parent.right = n.right;
            }

            else if (n.right != null){ // 1 child
                if (n.parent.right == n)
                    n.parent.right = n.right;
                else
                    n.parent.left = n.right;
            }

            else{ // no children
                if (n.parent.right == n)
                    n.parent.right = null;
                else
                    n.parent.left = null;
            }
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
