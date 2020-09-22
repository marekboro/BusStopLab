import java.util.ArrayList;

public class BusStop {

    // Attributes
    private String name;
    private ArrayList<Person> queue;

    // Constr.

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();

    }

    // Methods

    public int getQueueSize(){
        return this.queue.size();
    }

    public void addPersonToQueue(Person person){
        this.queue.add(person);
    }

    public boolean canRemoveFromQueue(){
        return this.queue.size()>0;
    }

    public void removePersonfromQueue(Person person){
        this.queue.remove(person);
    }

    public Person boardBus(Person person){
        if(canRemoveFromQueue()){
            this.queue.remove(person);
            return person;
        }
        return null;
    }





}
