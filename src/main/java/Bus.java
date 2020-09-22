import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus() {
        this.destination = "The Pub";
        this.capacity = 20;
        this.passengers = new ArrayList<>();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public boolean canAdd() {
        return this.passengers.size() < this.capacity;
    }

    public boolean canRemove() {
        return this.passengers.size() > 0;
    }

    public void addPassengers(Person person, int count) {
        for (int i = 0; i < count; i++) {
            if (canAdd()) {
                this.passengers.add(person);
            }
        }
    }

    public void addPassenger(Person person) {
            if (canAdd()) {
                this.passengers.add(person);
            }
    }

    public void removePassenger(Person person) {
        if (canRemove()) {
            this.passengers.remove(person);
        }
    }

    public void removePassengers(Person person, int count) {
        for (int i = 0; i < count; i++) {
            if (canRemove()) {
                this.passengers.remove(0);
            }
        }
    }

    public void pickUp(BusStop busStop, Person person) {
//        this.addPassenger(person);
//        busStop.removePersonfromQueue(person);
        this.addPassenger(busStop.boardBus(person));
//        busStop.boardBus(person);
    }

}
