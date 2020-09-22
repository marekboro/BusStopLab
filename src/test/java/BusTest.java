import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus();
    }

    @Test
    public void passengersShouldBeEmptyAtStart(){
        assertEquals(0,bus.getPassengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassengers(person,1);
        assertEquals(1,bus.getPassengerCount());

    }
    @Test
    public void cannotAddPasssengersBeyodBusCapacity(){
        bus.addPassengers(person,20);
        bus.addPassengers(person,1);
        assertEquals(20,bus.getPassengerCount());

    }

    @Test
    public void canAddIsFalseOnceCapacityIsMax(){
        bus.addPassengers(person,20);
        assertEquals(false,bus.canAdd());

    }

    @Test
    public void canRemoveIsFalseWhenPassengersIs0(){
        assertEquals(false,bus.canRemove());

    }

    @Test
    public void cannotRemoveIfBusIsEmpty(){
        bus.removePassengers(person,1);
        assertEquals(0,bus.getPassengerCount());
    }





}
