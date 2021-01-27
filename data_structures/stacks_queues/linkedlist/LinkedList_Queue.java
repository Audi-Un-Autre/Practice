

/*
    custom queue
*/


package data_structures.stacks_queues.linkedlist;

public class LinkedList_Queue<T> {
    Node<T> head;

    public void add(T data){
        if (head == null){
            head = new Node<T>(data);
            return;
        }

        // iterate to the end of the list
        Node<T> current = head;
        while (current.next != null){
            current = current.next;
        }

        // once we find the node.next that is null, create new node into the .next
        current.next = new Node<T>(data);
    }

    public T poll(){
        if (head == null) return null;

        // a poll returns the first in queue as well as removes it
        Node<T> oldHead = head;
        head = head.next;
        return oldHead.data;
    }

    public T peek(){
        if (head == null) return null;

        return head.data;
    }

    public void ToString(){
        if (head == null) System.out.println("Empty.");

        // iterate through linkedlist if there is > 1 item or the next is not null
        Node<T> current = head;
        while(current.next != null){
            System.out.println(current.data);
            current = current.next;
        }

        // next node is null
        System.out.println(current.data);
    }

}
