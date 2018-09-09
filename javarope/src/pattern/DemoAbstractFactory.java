package pattern;

abstract class Cloud {
    public abstract String getRam();

    public abstract String getCpu();

    public abstract String getHdd();

    @Override
    public String toString() {
        return "CPU = " + this.getCpu() + " RAM = " + this.getRam() + " HDD = " + this.getHdd();
    }
}

class AliYun extends Cloud {
    private String cpu;
    private String ram;
    private String hdd;

    public AliYun(String cpu, String ram, String hdd) {
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

    @Override
    public String toString() {
        return "AliYun configuration: {" + super.toString() + "}";
    }
}

class AWS extends Cloud {
    private String cpu;
    private String ram;
    private String hdd;

    public AWS(String cpu, String ram, String hdd) {
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

    @Override
    public String toString() {
        return "AWS configuration: {" + super.toString() + "}";
    }
}

class GoogleCloud extends Cloud {
    private String cpu;
    private String ram;
    private String hdd;

    public GoogleCloud(String cpu, String ram, String hdd) {
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

    @Override
    public String toString() {
        return "GoogleCloud configuration: {" + super.toString() + "}";
    }
}

interface CloudAbstractFactory {
    Cloud createCloud();
}

class AWSFactory implements CloudAbstractFactory {
    private String cpu;
    private String ram;
    private String hdd;

    public AWSFactory(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Cloud createCloud() {
        return new AWS(cpu, ram, hdd);
    }
}

class AliYunFactory implements CloudAbstractFactory {
    private String cpu;
    private String ram;
    private String hdd;

    public AliYunFactory(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Cloud createCloud() {
        return new AliYun(cpu, ram, hdd);
    }
}

class GoogleCloudFactory implements CloudAbstractFactory {
    private String cpu;
    private String ram;
    private String hdd;

    public GoogleCloudFactory(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Cloud createCloud() {
        return new GoogleCloud(cpu, ram, hdd);
    }
}

class CloudFactory {
    static Cloud getCloud(CloudAbstractFactory factory) {
        return factory.createCloud();
    }
}

public class DemoAbstractFactory {
    public static void main(String[] args) {
        Cloud aws = CloudFactory.getCloud(new AWSFactory("2 GHz", "8 GB", "2 T"));
        Cloud aliYun = CloudFactory.getCloud(new AliYunFactory("2 GHz", "8 GB", "2 T"));
        Cloud googleCould = CloudFactory.getCloud(new GoogleCloudFactory("2 GHz", "8 GB", "2 T"));

        System.out.println(aws);
        System.out.println(aliYun);
        System.out.println(googleCould);
    }
}
