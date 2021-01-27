

/*
    manual linkedlist queue system over java's in built deque system
*/


package data_structures.stacks_queues.implementations;

import data_structures.stacks_queues.BobaTea;
import data_structures.stacks_queues.BobaTea.Choice;
import data_structures.stacks_queues.linkedlist.LinkedList_Queue;

public class queue_custom {
    public static void main(String[] args){

        LinkedList_Queue<BobaTea> orders = new LinkedList_Queue<BobaTea>();

        orders.add(new BobaTea(0, "Coffee", Choice.MILK));        // 0
        orders.add(new BobaTea(1, "Taro", Choice.SMOOTHIE));      // 1
        orders.add(new BobaTea(2, "Matcha", Choice.MILK));        // 2
        orders.add(new BobaTea(3, "Ovaltine", Choice.ICE_CREAM)); // 3

        orders.poll();
        orders.ToString();
    }
}
