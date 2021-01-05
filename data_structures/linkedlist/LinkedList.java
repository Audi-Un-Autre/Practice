package data_structures.linkedlist;


public class LinkedList<T> {
    Node<T> head;

    public void add(int data){

        if (head == null) {
            head = new Node<T>(data);
            return;
        }

        Node<T> current = head;

        while (current.next != null) // while not at the end of the list
            current = current.next;
            
        current.next = new Node<T>(data);
    }

    public void delete(){
        if (head == null) return;
        if (head.next == null) head = null;

        Node<T> current = head;
        while (current.next != null){ // get to the last node in list
            current = current.next;
        }
        current = null; // delete last node
    }

    public void prepend(int data){
        // switch around values and make a tempholder like bubblesort
        Node<T> newHead = new Node<T>(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteValue(int data){
        if (head == null) return;
        if (head.next.data == data) head = head.next;

        Node<T> current = head;

        while (current.next != null){ // if not at the end of linkedlist
            if (current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next; // iterate to next node
        }
    }

    public void deleteAllValue(int data){
        if (head == null) return;

        Node<T> current = head;

        while (current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
            }
        }
    }
/*
    public String removeDupes(){
        if (head == null) return "List is empty.";
        if (head.next == null) return "No duplicates.";

        Node<T> current = head;

        while (current.next != null){ // use a tempHolder
            if (current.next.data == current.data){

            }
        }
    }
*/
    public void ToString(){
        if (head == null) return;
        if (head.next == null){
            System.out.print(head.data);
        }
        
        Node<T> current = head;
        System.out.print(current.data);
        while (current.next != null){
            System.out.print(", " + current.next.data);
        }
    }
}