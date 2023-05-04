package lesson14;

import java.util.Random;
import java.util.UUID;

public class ParkingTicket {

    private final Integer id = new Random().nextInt(1000_000);

    private Integer getId(){
        return id;
    }
}
