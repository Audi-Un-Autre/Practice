package data_structures.trees_graphs.linkedlist;

import data_structures.trees_graphs.linkedlist.Tree;

public class TreePractice {

    public static void main(String[] args){
        
        // wrapperless
        Node root = new Node(4);
        root.addNode(3);
        root.addNode(8);
        root.addNode(33);
        root.addNode(21);
        root.addNode(9);
        root.addNode(7);

        root.inOrder();

        System.out.println("\n");

        root.deleteNode(8);

        root.inOrder();
        
        

        /*
        // wrapper
        Tree order_id = new Tree();
        order_id.root = new Node(4);
        order_id.addNode(3);
        order_id.addNode(8);
        order_id.addNode(33);
        order_id.addNode(21);
        order_id.addNode(9);
        order_id.addNode(7);

        order_id.inOrder();
        System.out.println("\n");
        order_id.deleteNode(8);
        order_id.inOrder();
        */
        
    }
    
}
