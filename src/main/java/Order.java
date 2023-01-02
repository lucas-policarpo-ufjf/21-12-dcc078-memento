import java.util.ArrayList;
import java.util.List;

public class Order {
  private String productName;
  private Float totalPrice;
  private OrderState state;
  private List<OrderState> memento = new ArrayList<OrderState>();

  public Order(String productName, Float totalPrice) {
    this.state = OrderOpened.getInstance();
    this.productName = productName;
    this.totalPrice = totalPrice;
  }

  public void setState(OrderState state) {
    this.state = state;
    this.memento.add(this.state);
  }

  public void restoreState(int index) {
    if (index < 0 || index > this.memento.size() - 1) {
      throw new IllegalArgumentException("Indice invalido!");
    }

    this.state = this.memento.get(index);
  }

  public OrderState getState() {
    return state;
  }

  public List<OrderState> getMementoStates() {
    return this.memento;
  }

  public String getProductName() {
    return productName;
  }

  public Float getTotalPrice() {
    return totalPrice;
  }

}
