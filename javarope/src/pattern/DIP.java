package pattern;

interface IVehicle {
    public void run();
}

interface IDriver {
    public void drive(IVehicle vehicle);
}

class Benz implements IVehicle {

    @Override
    public void run() {
        System.out.println("Benz is running......");
    }
}

class Catalac implements IVehicle {

    @Override
    public void run() {
        System.out.println("Catalac is running......");
    }
}

class Driver implements IDriver{

    @Override
    public void drive(IVehicle vehicle) {
        vehicle.run();
    }
}

public class DIP {
    public static void main(String[] args) {
        IDriver driver = new Driver();
        Benz benz = new Benz();
        Catalac catalac = new Catalac();

        driver.drive(benz);
        driver.drive(catalac);
    }
}
