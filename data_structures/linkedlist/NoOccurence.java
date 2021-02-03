package data_structures.linkedlist;

public class NoOccurence {
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

        list.searchFor(78);
        list.searchFor(100);
    }     
}
