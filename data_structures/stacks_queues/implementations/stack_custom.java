

/*
    implement manual linkedlist stack over java's in built
*/

package data_structures.stacks_queues.implementations;

import data_structures.stacks_queues.BobaTea;
import data_structures.stacks_queues.BobaTea.Choice;
import data_structures.stacks_queues.linkedlist.LinkedList_Stack;

public class stack_custom {

    public static void main(String[] args){

        LinkedList_Stack<BobaTea> orders = new LinkedList_Stack<BobaTea>();

        orders.add(new BobaTea(0, "Coffee", Choice.MILK));        // 3
        orders.add(new BobaTea(1, "Taro", Choice.SMOOTHIE));      // 2
        orders.add(new BobaTea(2, "Matcha", Choice.MILK));        // 1
        orders.add(new BobaTea(3, "Ovaltine", Choice.ICE_CREAM)); // 0 

        orders.pop();
        orders.ToString();

    }
    
}
