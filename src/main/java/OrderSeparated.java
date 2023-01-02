public class OrderSeparated implements OrderState {
  private OrderSeparated() {
  };

  private static OrderSeparated instance = new OrderSeparated();

  public static OrderSeparated getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido separado";
  }

}
