package lesson11;

import java.sql.Driver;

public class Main {
    public static void main(String[] args) {

        CarDriving[] cars = {
                new KiaRio(),
                new RenauLogon(),
                new Vwpolo(),
                new Bmw()
        };

        FleetManager fleetManager =new FleetManager();
        fleetManager.setCarDrivings(cars);
        fleetManager.driveAll();

        MachineDriver driver = new MachineDriver();
        driver.setMachine(new Vwpolo());
        driver.startEngine();
        driver.setMachine(new Bmw());
        driver.startEngine();

        Bmw bmw= new BmwX6Alpina();

        bmw.startEngine("12352",15,true);

        bmw.startEngine("257342");
    }
}
