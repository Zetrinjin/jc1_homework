package lesson14;

import lesson4.Car;

import java.util.*;

public class Parking {

    //1.constructor
    //2.getter with initialization

    public static final int MAX_PARKING_SIZE = 20;

    Map<ParkingTicket, String> parkingTickets = new HashMap<>();

    public Parking() {
        //cars = new ArrayList<>();
    }

    private final List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
       /* if(this.cars == null){
            //cars = Collections.emptyList();//либо так
            this.cars = new ArrayList<>(0);//либо так
        }*/
        List<Car> copyCars = List.copyOf(cars);//для передачи копии а не оригинала(так правильнее)
        return copyCars;
    }

    public void setCars(List<Car> cars) {
       /* if(this.cars == null){
            this.cars = new ArrayList<>(0);//либо так
        }*/
        if (cars != null && cars.size() > 0) {
            this.cars.addAll(cars);
        }
        // this.cars = cars;
    }


    //добавили метод для добавления машин в обход имьютаблу
    public ParkingTicket park(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("car cannot be null");//используется для показа ошибки
        }
        if (cars.size() >= MAX_PARKING_SIZE) {
            throw new IllegalStateException("no parking places");
        }
        ParkingTicket ticket = new ParkingTicket();
        parkingTickets.put(ticket, car.getPlateNumber());
        this.cars.add(car);
        return ticket;
    }

    public String checkCarOnParking(ParkingTicket ticket) {
        return parkingTickets.get(ticket);
    }
}
