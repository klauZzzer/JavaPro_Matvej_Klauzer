package Homework_20_11.Part2;

public class Customer {
    private String name;
    private String email;
    private Order[] orderHistory;

    public Order[] getOrderHistory() {
        return orderHistory;
    }

    public Customer(String name, String email, Order[] orderHistory) {
        this.name = name;
        this.email = email;
        this.orderHistory = orderHistory;
    }

    public void makeOrder(Order order) {
        Order[] temp = new Order[orderHistory.length+1];
        for (int i = 0; i < orderHistory.length; i++) {
            temp[i] = orderHistory[i];
        }
        temp[temp.length-1] = order;
        orderHistory = temp;
        System.out.println("Заказ сделан!");
    }

    public void cancelOrder(Order order) {
        Order[] cancel = new Order[orderHistory.length-1];
        int temp = 0;
        for (int i = 0; i < orderHistory.length; i++) {
            if (!orderHistory[i].equals(order)) {
                cancel[temp] = orderHistory[i];
                temp++;
            }
        }
        orderHistory = cancel;
        System.out.println("Заказ отменен");
    }
}
