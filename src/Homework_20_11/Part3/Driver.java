package Homework_20_11.Part3;

public class Driver {
    private String name;
    private int drivingExperience;
    private Car driversCar;

    public String getName() {
        return name;
    }

    public void setDriversCar(Car driversCar) {
        this.driversCar = driversCar;
    }

    public Driver(String name, int drivingExperience, Car driversCar) {
        this.name = name;
        this.drivingExperience = drivingExperience;
        this.driversCar = driversCar;
    }

    public void assignCar(Car car) {
        driversCar = car;
        System.out.println("Водитель - " + name + " взял автомобиль:");
        driversCar.infoAboutCar();
    }

    public void removeCar(Car car) {
        driversCar = null;
        System.out.println("Водитель - " + name + " поставил в парк автомобиль:");
        car.infoAboutCar();
    }
}
