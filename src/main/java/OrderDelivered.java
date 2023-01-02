public class OrderDelivered implements OrderState {
  private OrderDelivered() {
  };

  private static OrderDelivered instance = new OrderDelivered();

  public static OrderDelivered getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido entregue";
  }

}
