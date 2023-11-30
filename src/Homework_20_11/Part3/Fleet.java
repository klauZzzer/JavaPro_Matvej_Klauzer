package Homework_20_11.Part3;

public class Fleet {
    private String name;
    private String address;
    private FleetManager[] fleetManagers;

    public Fleet(String name, String address, FleetManager[] fleetManagers) {
        this.name = name;
        this.address = address;
        this.fleetManagers = fleetManagers;
    }

    public void addManager(FleetManager fleetManager) {
        FleetManager[] temp = new FleetManager[fleetManagers.length+1];
        for (int i = 0; i < fleetManagers.length; i++) {
            temp[i] = fleetManagers[i];
        }
        temp[temp.length-1] = fleetManager;
        fleetManagers = temp;
        System.out.println("Новый менеджер добавлен в парк!");
    }

    public void searchManager(String name) {
        int temp = 0;
        for (int i = 0; i < fleetManagers.length; i++) {
            if (name.equals(fleetManagers[i].getName())) {
                System.out.println("Мы нашли менеджера c именем - " + name);
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Такого менеджера нет в базе данных");
        }
    }
}
