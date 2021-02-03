package data_structures.linkedlist;

public class nthNodeFromEnd {
    public static void main(String[] args){
        LinkedList list = new LinkedList<>();

        list.add(5);
        list.add(20);
        list.add(15);
        list.add(198);
        list.add(5);
        list.add(38);
        list.add(932);
        list.add(78);

        list.nthNodeFromEnd(10); //there are only 8 nodes in the list
        list.nthNodeFromEnd(5); //198
    }
}
