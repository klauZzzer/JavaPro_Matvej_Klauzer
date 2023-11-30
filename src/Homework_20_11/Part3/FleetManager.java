package Homework_20_11.Part3;

public class FleetManager {
    private String name;
    private Car[] cars;
    private Driver[] drivers;

    public String getName() {
        return name;
    }

    public FleetManager(String name, Car[] cars, Driver[] drivers) {
        this.name = name;
        this.cars = cars;
        this.drivers = drivers;
    }

    public void addCarInFleet(Car car) {
        Car[] temp = new Car[cars.length+1];
        for (int i = 0; i < cars.length; i++) {
            temp[i] = cars[i];
        }
        temp[temp.length-1] = car;
        cars = temp;
        System.out.println("В парк добавлен автомобиль:");
        car.infoAboutCar();
    }

    public void assignCarToDriver(Car car, Driver driver) {
        driver.setDriversCar(car);
        System.out.println("Менеджер назначил автомобиль для - " + driver.getName());
        car.infoAboutCar();
    }
}
