
// binary search tree

package data_structures.trees_graphs.linkedlist;

public class Node {

    int data;
    Node right;
    Node left;

    public Node (int data){
        right = left = null;
        this.data = data;
    }

    public void addNode(int data){
        if (data < this.data){
            if (this.left == null)
                this.left = new Node(data);
            else
                left.addNode(data); // recurse until available node is reached
        }

        if (data > this.data){
            if (this.right == null)
                this.right = new Node(data);
            else
                right.addNode(data); // recurse until available node is reached
        }
    }

    public void inOrder(){
        if (this.left != null){
            left.inOrder(); // continue getting to the leftmost node
        }

        System.out.println(this.data);

        if (this.right != null){
            right.inOrder(); // go the right after left has been exhausted
        }
    }
}


