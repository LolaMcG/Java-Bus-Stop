import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengerList;

    public Bus (String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengerList = new ArrayList<>();
    }

    public int getPassengerCount(){
        return this.passengerList.size();
    }

    public void addPassenger(Person passenger1){
        if (this.passengerList.size() < this.capacity){
            this.passengerList.add(passenger1);
        }
    }

    public Person removeFromBus(){
        return this.passengerList.remove(0);
    }


}
