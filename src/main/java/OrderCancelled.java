public class OrderCancelled implements OrderState {
  private OrderCancelled() {
  };

  private static OrderCancelled instance = new OrderCancelled();

  public static OrderCancelled getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido cancelado";
  }

}
