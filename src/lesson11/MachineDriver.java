package lesson11;

public class MachineDriver {
    private Machine machine;

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public void startEngine(){
       // machine.getBrandName();
        machine.startEngine();
    }
}
