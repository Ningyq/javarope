package com;

public class GPSTest {
    public static void main(String[] args) {
        System.out.println("自定义普通的汽车：");
        Car car = new Car();
        car.setName("Adui");
        car.setSpeed(60);
        System.out.println(car);
        System.out.println("自定义的GPS汽车：");
        GPSCar gpsCar = new GPSCar();
        gpsCar.setName("Adui");
        gpsCar.setSpeed(60);
        System.out.println(gpsCar);
    }
}
