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

    public void searchFor(int data){
        if (head == null) return;

        if (head.next == null){
            if (head.data != data)
                System.out.println(data + " not found.");
            else if (head.data == data){
                System.out.println(data + " found.");
            }
            return;
        }

        Node<T> current = head;
        while(current.next != null){
            if (current.data == data){
                System.out.println(current.data + " found.");
                return;
            }
            current = current.next;
            if (current.next == null){
                if (current.data == data){
                    System.out.println(current.data + " found.");
                    return;
                }
            }
        }

        System.out.println(data + " not found.");
    }

    public void nthNodeFromEnd(int n){
        if (head == null) return;

        Node<T> current = head;
        Node<T> tracker = current;

        int steps = 0;

        while(tracker.next != null){
            steps++;
            tracker = tracker.next; // go to the end of list
            if (tracker.next == null){ // count last node
                steps++;
            }
        }

        if (steps < n){
            System.out.println("There are only " + steps + " nodes in this list.");
            return;
        } else{
            int stepsToTake = steps - n; // steps - n is the nth from the last node, the count of the list minues the n elements
            int stepsTaken = 0;
            while(current.next != null && stepsTaken < stepsToTake){
                stepsTaken++;
                current = current.next;
            }
        }

        System.out.println("The " + n + " node from the last is " + current.data);
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