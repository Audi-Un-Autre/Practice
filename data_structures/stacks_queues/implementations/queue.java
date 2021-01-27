
/*
    Queues are First In, First Out
    first come first serve

    ***   using java's in built deque   ***
*/

package data_structures.stacks_queues.implementations;

import java.util.LinkedList;
import java.util.Queue;

import data_structures.stacks_queues.BobaTea.Choice;
import data_structures.stacks_queues.BobaTea;

public class queue {
    public static void main (String[] args){
        Queue<BobaTea> orders = new LinkedList<BobaTea>();

        orders.add(new BobaTea(0, "Coffee", Choice.MILK));        // 0 first in, last out
        orders.add(new BobaTea(1, "Taro", Choice.SMOOTHIE));      // 1
        orders.add(new BobaTea(2, "Matcha", Choice.MILK));        // 2
        orders.add(new BobaTea(3, "Ovaltine", Choice.ICE_CREAM)); // 3

        // display all bobatea orders
        System.out.println("\n\nAll orders.");
        for (BobaTea b : orders)
            System.out.println(b.getID() + ": " + b.getName() + " " + b.getChoice());   

        // peek at the first in queue and remove it since we are now serving it
        BobaTea currentServe = orders.peek();
        currentServe = orders.poll();
        System.out.println("Now serving: " + currentServe.getID() + ": " + currentServe.getName() + " " + currentServe.getChoice());

        System.out.println("\n");

        // display what the queue looks like after remove()
        System.out.println("Updated orders.");
        for (BobaTea b : orders)
            System.out.println(b.getID() + ": " + b.getName() + " " + b.getChoice());

        // new order has come in, add to end of the queue 
        System.out.println("\nNew order has come in.");
        BobaTea newOrder = new BobaTea(4, "Matcha", Choice.SMOOTHIE);
        orders.add(newOrder);

        // display new order
        System.out.println(newOrder.getID() + ": " + newOrder.getName() + " " + newOrder.getChoice());

        // print updated orders
        System.out.println("\nUpdated orders.");
        for (BobaTea b : orders)
            System.out.println(b.getID() + ": " + b.getName() + " " + b.getChoice());
    }
}
