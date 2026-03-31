public class OnlineRetail{
    static class Order {
        private int orderId;
        private String orderDate;
        public Order(int orderId, String orderDate) {
            this.orderId = orderId;
            this.orderDate = orderDate;
        }
        public int getOrderId() {
            return orderId;
        }
        public String getOrderDate() {
            return orderDate;
        }
        public String getOrderStatus() {
            return "Order Placed";
        }
    }
    static class ShippedOrder extends Order {
        private String trackingNumber;
        public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
            super(orderId, orderDate);
            this.trackingNumber = trackingNumber;
        }
        public String getTrackingNumber() {
            return trackingNumber;
        }
        @Override
        public String getOrderStatus() {
            return "Order Shipped";
        }
    }
    static class DeliveredOrder extends ShippedOrder {
        private String deliveryDate;
        public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
            super(orderId, orderDate, trackingNumber);
            this.deliveryDate = deliveryDate;
        }
        public String getDeliveryDate() {
            return deliveryDate;
        }

        @Override
        public String getOrderStatus() {
            return "Order Delivered";
        }
    }
    public static void main(String[] args) {
        Order order1 = new Order(1001, "2025-01-01");
        Order order2 = new ShippedOrder(1002, "2025-12-02", "TRK12345");
        Order order3 = new DeliveredOrder(1003, "2025-09-05", "TRK67890", "2025-01-06");

        System.out.println("Order 1 Status: " + order1.getOrderStatus());
        System.out.println("Order 2 Status: " + order2.getOrderStatus());
        System.out.println("Order 3 Status: " + order3.getOrderStatus());
    }
}
