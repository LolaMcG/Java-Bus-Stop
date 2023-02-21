import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus lothianBus;
    private Person jasmine;
    private BusStop queue;

    @Before
    public void before(){
        lothianBus = new Bus ("Glasgow", 5);
        jasmine = new Person();
        queue = new BusStop("Waverley Place");

    }

    @Test
    public void no_of_passengers(){
        assertEquals(0, lothianBus.getPassengerCount());
    }

    @Test
    public void can_add_passenger_if_enough_space(){
        lothianBus.addPassenger(jasmine);
        assertEquals(1, lothianBus.getPassengerCount());
    }

    @Test
    public void not_enough_room_for_passenger(){
//        Each 'Jasmine' is a different person, we just couldn't be bothered to initialise multiple different people
        lothianBus.addPassenger(jasmine);
        lothianBus.addPassenger(jasmine);
        lothianBus.addPassenger(jasmine);
        lothianBus.addPassenger(jasmine);
        lothianBus.addPassenger(jasmine);
        lothianBus.addPassenger(jasmine);
        assertEquals(5, lothianBus.getPassengerCount());
    }

    @Test
    public void can_remove_passenger(){
        lothianBus.addPassenger(jasmine);
        lothianBus.removeFromBus();
        assertEquals(0, lothianBus.getPassengerCount());
    }

    @Test
    public void can_pickup_passenger_from_bus_stop(){
        queue.addPassengerToQueue(jasmine);
        queue.removePassengerFromQueue();
        lothianBus.addPassenger(jasmine);
        assertEquals(0, queue.passengerCount());
        assertEquals(1, lothianBus.getPassengerCount());
    }




}
