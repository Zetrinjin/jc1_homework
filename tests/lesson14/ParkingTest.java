package lesson14;

import lesson4.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParkingTest {

    Parking target;
    @Before
    public void setUp() throws Exception {
        target =new Parking();
    }

    @After
    public void tearDown() throws Exception {
        target =null;
    }

    @Test
    public void getCars() {
    }

    @Test
    public void setCars() {
        //Given
        List<Car> testList =List.of(new Car(123));

        //when
        target.setCars(testList);

        //then
        assertEquals(2, target.getCars().size());
    }

    @Test
    public void park() {
    }

    @Test
    public void checkCarOnParking() {
    }
}