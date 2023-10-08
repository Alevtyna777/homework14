package coffee.order;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> orders = new LinkedList<>();
    private int orderNumber = 1;
    private static System LogManager;
    private static final Logger logger = (Logger) LogManager.getLogger(String.valueOf(CoffeeOrderBoard.class));

    public void add(String clientName) {
        orders.add(new Order(orderNumber++, clientName));
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order order = orders.poll();
            System.out.println("Delivering Order #" + order.getOrderNumber() + " for " + order.getClientName());
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        Order orderToDeliver = null;
        for (Order order : orders) {
            if (String.valueOf(order.getOrderNumber()).equals(String.valueOf(orderNumber))) {
                orderToDeliver = order;
                break;
            }
        }

        if (orderToDeliver != null) {
            orders.remove(orderToDeliver);
            System.out.println("Delivering Order #" + orderToDeliver.getOrderNumber() + " for " + orderToDeliver.getClientName());
        } else {
            System.out.println("Order #" + orderNumber + " not found.");
        }
    }



    public void draw(){
        Process logger = null;
        for (Order order : orders) {
            logger.info();
        }
        logger.info();
    }
}