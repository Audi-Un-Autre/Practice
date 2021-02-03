package data_structures.linkedlist;

public class NoDupes {
    public static void main(String[] args){
        LinkedList<Integer> dupes = new LinkedList<Integer>();

        dupes.add(1);
        dupes.add(1);
        dupes.add(3);
        dupes.add(3);
        dupes.add(5);
        dupes.add(5);
        dupes.add(7);
        dupes.add(7);
        dupes.removeDupes();
        dupes.ToString();
    }
}
