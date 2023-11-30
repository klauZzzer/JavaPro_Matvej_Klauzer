package Homework_20_11.Part2;

public class Order {
    private Product[] productList;
    private OrderStatus orderStatus;
    private int sum;

    public Product[] getProductList() {
        return productList;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Order(Product[] productList, OrderStatus orderStatus, int sum) {
        this.productList = productList;
        this.orderStatus = orderStatus;
        this.sum = sum;
    }

    public void addProduct(Product product) {
        Product[] temp = new Product[productList.length+1];
        for (int i = 0; i < productList.length; i++) {
            temp[i] = productList[i];
        }
        temp[temp.length-1] = product;
        productList = temp;
    }

    public void countSum() {
        int sum = 0;
        for (int i = 0; i < productList.length; i++) {
            sum += productList[i].getPrice();
        }
        System.out.println("Сумма заказа - " + sum);
    }
}
