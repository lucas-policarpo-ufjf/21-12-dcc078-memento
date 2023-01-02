import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

  @Test
  void shouldPersistOrderStates() {
    Order order = new Order("Pendrive 32GB", 40.5f);
    order.setState(OrderPaid.getInstance());
    order.setState(OrderCancelled.getInstance());
    assertEquals(2, order.getMementoStates().size());
  }

  @Test
  void shouldRestoreToInitialOrderStates() {
    Order order = new Order("Pendrive 32GB", 40.5f);
    order.setState(OrderPaid.getInstance());
    order.setState(OrderCancelled.getInstance());
    order.restoreState(0);

    assertEquals(OrderPaid.getInstance(), order.getState());
  }

  @Test
  void shouldRestoreToPreviousOrderStates() {
    Order order = new Order("Pendrive 32GB", 40.5f);
    order.setState(OrderOpened.getInstance());
    order.setState(OrderPaid.getInstance());
    order.setState(OrderSeparated.getInstance());
    order.setState(OrderDispatched.getInstance());
    order.setState(OrderCancelled.getInstance());
    order.restoreState(2);

    assertEquals(OrderSeparated.getInstance(), order.getState());
  }

  @Test
  void shouldThrowsExceptionWithInvalidIndex() {
    try {
      Order order = new Order("Pendrive 32GB", 40.5f);
      order.setState(OrderOpened.getInstance());
      order.restoreState(2);
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals("Indice invalido!", e.getMessage());
    }

  }
}
