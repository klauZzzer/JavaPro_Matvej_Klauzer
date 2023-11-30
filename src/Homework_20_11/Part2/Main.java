package Homework_20_11.Part2;

public class Main {
    public static void main(String[] args) {
        //Сейчас вроде получилось получше но уверен далеко не идеально
        //Я даже знаю некоторые свои ошибки, но слишком мало времени чтобы их исправить
        //вроде и так не прям ужас получился.

        Product apple = new Product("Apple", 15, 11);
        Product banana = new Product("Banana", 20, 13);
        Product lemon = new Product("Lemon", 10, 5);
        Product lime = new Product("Lime", 15,6);
        Product watermelon = new Product("Watermelon", 35, 21);

        Customer customerId1 = new Customer("Nolan Lens", "lensGmail.com", new Order[]{});
        Customer customerId2 = new Customer("John Jonson", "johnGmail.com", new Order[]{});

        Order orderId1 = new Order(new Product[]{}, OrderStatus.IN_PROCESS, 0);
        Order orderId2 = new Order(new Product[]{}, OrderStatus.IN_PROCESS, 0);

        OrderManager orderManager = new OrderManager(new Product[]{apple, banana, lemon, lime, watermelon},
                new Order[]{});

        apple.isInStock();
        lemon.updateStock(10);
        System.out.println();

        orderId1.addProduct(banana);
        orderId1.addProduct(watermelon);
        orderId1.addProduct(lemon);
        orderId1.countSum();
        System.out.println();

        orderId2.addProduct(lime);
        orderId2.addProduct(apple);
        orderId2.countSum();
        System.out.println();

        customerId1.makeOrder(orderId1);
        customerId1.cancelOrder(orderId1);
        customerId1.makeOrder(orderId2);
        System.out.println();

        orderManager.takeNewOrder(orderId1);
        orderManager.takeNewOrder(orderId2);
        orderManager.updateOrderStatus(orderId1, OrderStatus.IN_PROCESS);
        orderManager.updateOrderStatus(orderId2, OrderStatus.CANCELED);

    }
}
