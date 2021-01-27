package data_structures.stacks_queues.linkedlist;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        next = null;
    }

    @Override
    public String toString(){
        return data.toString();
    }
}
