package Homework_20_11.Part3;

public class Main {
    public static void main(String[] args) {
        //В 3 раз вроде все работает как надо и без ошибок, надеюсь, может и что-то не так сделал
        //И получилось гораздо быстрее, прям почувствовал что быстрее пишу и многие методы можно
        //было взять с предыдущих заданий

        Car carId1 = new Car("Toyota", "Supra", 1981);
        Car carId2 = new Car("Toyota", "Mark2", 2004);
        Car carId3 = new Car("Toyota", "LandCruiser 200", 2021);
        carId1.infoAboutCar();
        carId2.isChecked();
        carId3.isChecked();
        System.out.println();

        Driver driverId1 = new Driver("John Jonson", 21, null);
        Driver driverId2 = new Driver("Nolan Lens", 11, carId2);
        driverId1.assignCar(carId1);
        driverId2.removeCar(carId2);
        System.out.println();

        FleetManager fleetManagerId1 = new FleetManager("Harry Potter", new Car[]{carId1, carId2},
                new Driver[]{driverId1, driverId2});
        FleetManager fleetManagerId2 = new FleetManager("Tom Radle", new Car[]{carId1, carId2, carId3},
                new Driver[]{driverId1, driverId2});
        fleetManagerId1.addCarInFleet(carId3);
        fleetManagerId1.assignCarToDriver(carId3, driverId2);
        System.out.println();

        Fleet fleet = new Fleet("DownTown Fleet", "Schoenberg St.31",
                new FleetManager[]{fleetManagerId1});
        fleet.addManager(fleetManagerId2);
        fleet.searchManager("Harry Potter");
        fleet.searchManager("Mama Mia");
    }
}
