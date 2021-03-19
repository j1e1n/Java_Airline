import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.MINI222);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.MINI222, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(180,plane.getPlaneType().getCapacity());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(10000.00, plane.getPlaneType().getTotalWeightKg(),0.0);
    }


}

