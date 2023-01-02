public class OrderPaid implements OrderState {
  private OrderPaid() {
  };

  private static OrderPaid instance = new OrderPaid();

  public static OrderPaid getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido pago";
  }

}
