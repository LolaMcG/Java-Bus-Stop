import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busShelter;
    private Person kelly;


    @Before
    public void before(){
        busShelter = new BusStop("Waverley Place");
        kelly = new Person();
    }


    @Test
    public void can_add_passenger_to_queue(){
        busShelter.addPassengerToQueue(kelly);
        assertEquals(1, busShelter.passengerCount());
    }

    @Test
    public void can_remove_passenger_from_queue(){
        busShelter.addPassengerToQueue(kelly);
        busShelter.removePassengerFromQueue();
        assertEquals(0, busShelter.passengerCount());
    }

}
