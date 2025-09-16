package Inheritance;

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order " + orderId + " has been shipped with Tracking No: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order " + orderId + " was delivered on " + deliveryDate;
    }
}

public class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order("O101", "2025-09-01");
        ShippedOrder shipped = new ShippedOrder("O102", "2025-09-02", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("O103", "2025-09-03", "TRK67890", "2025-09-05");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}