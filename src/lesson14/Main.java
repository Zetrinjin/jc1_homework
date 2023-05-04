package lesson14;


import lesson4.Car;

public class Main {
    public static void main(String[] args) {


        try {
            Parking parking = new Parking();

            parking.setCars(null);
            //пытаемся получить из имьютабл инфу, а так нельзя
            ParkingTicket ticket1 = parking.park(new Car(20_000));
            ParkingTicket ticket2 = parking.park(new Car(30_000));
            // parking.getCars().remove(0);//поставили защиту на внутр задачи

            for(Car car: parking.getCars()){
                System.out.println(car);
            }

            ParkingTicket ticket3 = new ParkingTicket();
            System.out.println(parking.checkCarOnParking(ticket1));
            System.out.println(parking.checkCarOnParking(ticket2));
            System.out.println(parking.checkCarOnParking(ticket3));
            //System.out.println(1/0);
        } catch (Exception e) {//этот блок нельзя оставлять пустым(НИКОГДА)
            e.printStackTrace();//для вывода пути ошибки
            System.exit(1);//error status
        } finally {
            System.exit(0);//normal exit
        }

    }
}
