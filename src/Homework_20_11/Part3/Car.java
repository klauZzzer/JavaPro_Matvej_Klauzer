package Homework_20_11.Part3;

public class Car {
    private String mark;
    private String model;
    private int yearOfRelease;

    public Car(String mark, String model, int yearOfRelease) {
        this.mark = mark;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    public void infoAboutCar() {
        System.out.println("Марка машины - " + this.mark);
        System.out.println("Модель машины - " + this.model);
        System.out.println("Год выпуска машины - " + this.yearOfRelease);
    }

    public void isChecked() {
        if (this.yearOfRelease >= 2010) {
            System.out.println("Машина была на техосмотре");
        } else {
            System.out.println("Машина нуждается в техосмотре");
        }
    }
}
