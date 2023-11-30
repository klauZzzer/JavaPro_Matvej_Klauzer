package Homework_20_11.Part2;

public class Product {
    private String name;
    private int price;
    private int count;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public Product(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public void isInStock() {
        if (this.count > 0) {
            System.out.println("Товар есть в наличии!");
        } else {
            System.out.println("Товара нет в наличии");
        }
    }

    public void updateStock(int count) {
        this.count += count;
    }

}
