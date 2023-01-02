public class OrderDispatched implements OrderState {
  private OrderDispatched() {
  };

  private static OrderDispatched instance = new OrderDispatched();

  public static OrderDispatched getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido despachado";
  }

}
