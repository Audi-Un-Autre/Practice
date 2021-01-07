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
            current = current.next;
        }
    }

    public void removeDupes(){
        if (head == null) return;
        if (head.next == null) return;

        Node<T> current = head;
        Node<T> currentTemp = head;

        while (currentTemp.next != null){
            int occurence = 0;
            if (current.data == currentTemp.data) occurence++;
            while (current.next != null){ // loop through all nodes in original list
                if (current.next.data == currentTemp.data){
                    occurence++;
                    if (occurence > 1 && current.next.next != null)
                        current.next = current.next.next;
                    if (occurence > 1 && current.next.next == null){
                        current.next = null;
                        return; // end of list
                    }
                }
                current = current.next;
            }
            currentTemp = currentTemp.next;
            current = head; // start back to beginning of original list
        }
    }

    public void ToString(){
        if (head == null) return;
        if (head.next == null){
            System.out.print(head.data);
        }
        
        Node<T> current = head;
        System.out.print(current.data);
        while (current.next != null){
            System.out.print(", " + current.next.data);
            current = current.next;
        }
    }
}