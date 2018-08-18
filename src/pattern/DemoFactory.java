package pattern;

abstract class Computer {
    public abstract String getRam();

    public abstract String getCpu();

    public abstract String getHdd();

    @Override
    public String toString() {
        return "CPU = " + this.getCpu() + " RAM = " + this.getRam() + " HDD = " + this.getHdd();
    }
}

class PC extends Computer {
    private String cpu;
    private String ram;
    private String hdd;

    public PC(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }
}

class Server extends Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private final String name = "";

    public Server(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }
}

class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(cpu, ram, hdd);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(cpu, ram, hdd);
        }
        return null;
    }
}

public class DemoFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "4 GB", "1 T", "2.4 GHZ");
        Computer server = ComputerFactory.getComputer("Server", "32 GB", "5 T", "3.2 GHZ");

        System.out.println(pc);
        System.out.println(server);
    }
}
