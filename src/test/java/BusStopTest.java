import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person1;
    private Person person2;


    @Before
    public void before() {
        busStop = new BusStop("The End of the World");
        person1 = new Person();
        person2 = new Person();

    }

    @Test
    public void queueIsEmptyAtStart() {
        assertEquals(0, busStop.getQueueSize());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addPersonToQueue(person1);
        assertEquals(1, busStop.getQueueSize());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPersonToQueue(person1);
        busStop.addPersonToQueue(person2);
        busStop.removePersonfromQueue(person1);
        assertEquals(1, busStop.getQueueSize());


    }


}
