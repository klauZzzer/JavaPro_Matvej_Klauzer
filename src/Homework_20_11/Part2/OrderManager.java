package Homework_20_11.Part2;

public class OrderManager {
    private Product[] products;
    private Order[] orders;

    public OrderManager(Product[] products, Order[] orders) {
        this.products = products;
        this.orders = orders;
    }


    public void takeNewOrder(Order order) {
        Order[] temp = new Order[orders.length+1];
        for (int i = 0; i < orders.length; i++) {
            temp[i] = orders[i];
        }
        temp[temp.length-1] = order;
        orders = temp;
        System.out.println("Заказ принят и обрабатывается!");
    }

    public void updateOrderStatus(Order order, OrderStatus orderStatus) {
        if (orderStatus == OrderStatus.DELIVERED) {
            System.out.println("Статус заказа изменен на - 'Доставлен'");
            order.setOrderStatus(OrderStatus.DELIVERED);
        }
        if (orderStatus == OrderStatus.IN_PROCESS) {
            System.out.println("Статус заказа изменен на - 'В процессе'");
            order.setOrderStatus(OrderStatus.IN_PROCESS);
        }
        if (orderStatus == OrderStatus.CANCELED) {
            System.out.println("Статус заказа изменен на - 'Отменен'");
            order.setOrderStatus(OrderStatus.CANCELED);
        }
    }
}
