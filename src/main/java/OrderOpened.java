public class OrderOpened implements OrderState {
  private OrderOpened() {
  };

  private static OrderOpened instance = new OrderOpened();

  public static OrderOpened getInstance() {
    return instance;
  }

  public String getState() {
    return "Pedido aberto";
  }

}
