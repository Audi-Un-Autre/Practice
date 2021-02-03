
// binary search tree

package data_structures.trees_graphs.linkedlist;

public class Node {

    int data;
    Node right;
    Node left;
    Node parent;

    public Node (int data){
        right = left = null;
        this.data = data;
    }

    public void addNode(int data){
        if (data < this.data){
            if (this.left == null){
                this.left = new Node(data);
                this.left.parent = this;
            }
            else
                left.addNode(data); // recurse until available node is reached
        }

        if (data > this.data){
            if (this.right == null){
                this.right = new Node(data);
                this.right.parent = this;
            }
            else
                right.addNode(data); // recurse until available node is reached
        }
    }

    public void deleteNode(int data){

        if (data < this.data){
            if (left != null){
                left.deleteNode(data); // recurse until node is found
            }
        }

        else if (data > this.data){
            if (right != null){
                right.deleteNode(data); // recurse until node is found
            }
        }

        else { // data found
            if (left != null && right != null){ // 2 children
                Node minNode = right;
                Node current = right;

                while (current.right != null){
                    if (current.right.data < current.data){
                        minNode = current.right;
                    }
                    current = current.right;
                }

                this.data = minNode.data;
                this.right.deleteNode(this.data); // recurse through this nodes right descendants, delete the node we just copied

            }

            else if (left != null){ //1 child
                if (this.parent.right == this) // determine if this node is the left or right child of its parent node
                    this.parent.right = this.left;
                else
                    this.parent.left = this.left;
            }

            else if (right != null){ // 1 child
                if (this.parent.right == this)
                    this.parent.right = this.right;
                else
                    this.parent.left = this.right;
            }

            else { // no children
                if(this.parent.right == this) 
                    this.parent.right = null;
                else 
                    this.parent.left = null;
                
            }
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


