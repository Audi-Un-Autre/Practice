
/*
    Stacks are Last In, First Out.
    Remove from the top which was the last in.

    ***   using java's in built stack   ***
*/
package data_structures.stacks_queues.implementations;

import java.util.Stack;

import data_structures.stacks_queues.BobaTea.Choice;
import data_structures.stacks_queues.BobaTea;


public class stack {

    public static void main(String[] args){
        Stack<BobaTea> orders = new Stack<BobaTea>();

        orders.add(new BobaTea(0, "Coffee", Choice.MILK));        // 0
        orders.add(new BobaTea(1, "Taro", Choice.SMOOTHIE));      // 1
        orders.add(new BobaTea(2, "Matcha", Choice.MILK));        // 2
        orders.add(new BobaTea(3, "Ovaltine", Choice.ICE_CREAM)); // 3 last in, first out 0

        // display all bobatea orders
        System.out.println("\n\nAll orders.");
        for (BobaTea b : orders)
            System.out.println(b.getID() + ": " + b.getName() + " " + b.getChoice());   

        // peek at the top of the stack (the last in) and remove it since we are now serving it
        BobaTea currentServe = orders.peek(); 
        currentServe = orders.pop();
        System.out.println("Now serving: " + currentServe.getID() + ": " + currentServe.getName() + " " + currentServe.getChoice());

        System.out.println("\n");

        // display what the stack looks like after pop()
        System.out.println("Updated orders.");
        for (BobaTea b : orders)
            System.out.println(b.getID() + ": " + b.getName() + " " + b.getChoice());

        // new order has come in. push it to the top of the stack
        System.out.println("\nNew order has come in.");
        orders.push(new BobaTea(4, "Matcha", Choice.SMOOTHIE));

        // display new order
        BobaTea newOrder = orders.peek();
        System.out.println(newOrder.getID() + ": " + newOrder.getName() + " " + newOrder.getChoice());

        // print updated orders
        System.out.println("\nUpdated orders.");
        for (BobaTea b : orders)
            System.out.println(b.getID() + ": " + b.getName() + " " + b.getChoice());

    }
}
