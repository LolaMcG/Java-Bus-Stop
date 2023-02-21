import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList <Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public void addPassengerToQueue(Person passenger){
        this.queue.add(passenger);
    }

    public int passengerCount(){
        return this.queue.size();
    }

    public Person removePassengerFromQueue(){
        return this.queue.remove(0);
    }
}
