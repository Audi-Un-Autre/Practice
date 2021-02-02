package data_structures.trees_graphs.linkedlist;

import data_structures.trees_graphs.linkedlist.Tree;

public class TreePractice {

    public static void main(String[] args){
        /*
        Node root = new Node(4);
        root.addNode(3);
        root.addNode(8);
        root.addNode(33);
        root.addNode(21);
        root.addNode(9);
        root.addNode(7);

        root.inOrder();
        */

        Tree order_id = new Tree();
        order_id.root = new Node(3);
        order_id.addNode(4);
        order_id.addNode(22);
        order_id.addNode(85);
        order_id.addNode(14);
        order_id.addNode(9);
        order_id.inOrder();

    }
    
}
