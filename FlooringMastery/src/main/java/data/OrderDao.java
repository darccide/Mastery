package data;

import java.time.LocalDate;
import java.util.List;
import models.Order;

public interface OrderDao {

    // finds all orders
    List<Order> findAll();

    // add order
    Order add(int orderNumber, Order order);

    // edit order by date
    Order edit(int orderNumber, LocalDate date);

    // find order by date
    Order find(int orderNumber, LocalDate date);

    // remove order by date
    Order remove(int orderNumber, LocalDate date);

    // generate order number
    int createOrderNumber(Order order);
}
