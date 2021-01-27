package data_structures.stacks_queues;

/*
    boba is best drink :D
*/

public class BobaTea {
    private int order_id;
    private String name;
    private Choice choice;

    public enum Choice{
        TEA,
        MILK,
        SMOOTHIE,
        ICE_CREAM    
    }

    public BobaTea(){}
    
    public BobaTea(int order_id, String name, Choice choice){
        this.order_id = order_id;
        this.name = name;
        this.choice = choice;
    }

    // get and set assume

    public int getID(){
        return order_id;
    }
    
    public String getName(){
        return name;
    }

    public Choice getChoice(){
        return choice;
    }

    // to string
    public String toString(){
        return (this.getID() + ": " + this.getName() + " " + this.getChoice());
    }
}
