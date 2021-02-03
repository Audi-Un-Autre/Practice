

/*
    custom stack
*/

package data_structures.stacks_queues.linkedlist;

public class LinkedList_Stack<T> {
    Node<T> head;

    public void add(T data){
        if (head == null){
            head = new Node<T>(data);
            return;
        }

        // prepend new node as head of list
        Node<T> oldHead = head;
        Node<T> newHead = new Node<T>(data);
        head = newHead;
        head.next = oldHead;

    }

    public void pop(){
        // list is empty
        if (head == null) return;

        // make head null if only item
        if (head.next == null){
            head = null;
            return;
        }

        head = head.next;
    }

    public void peek(){
        //list is empty
        if (head == null) return;

        System.out.println(head.data);
    }

    public void ToString(){

        if (head == null) System.out.println("Empty.");
        
        // print out the current head
        Node<T> current = head;

        // if more items in list, loop and print all
        while(current.next != null){
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println(current.data);
    }
}
