package coffe.order;

import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        coffee.order.CoffeeOrderBoard board;
        board = new coffee.order.CoffeeOrderBoard();

        board.add("Alen");
        board.add("Yoda");
        board.add("Obi-van");
        board.add("John Snow");

        board.deliver(); // Deliver the first order
        board.deliver(3); // Deliver a specific order
        board.draw(); // Display the remaining orders
    }
}