package mk.ukim.finki.emt.ordermanagement.domain.repository;

import mk.ukim.finki.emt.ordermanagement.domain.model.Order;
import mk.ukim.finki.emt.ordermanagement.domain.model.OrderId;
import org.springframework.data.jpa.repository.JpaRepository;

public class OrderRepository extends JpaRepository<Order, OrderId> {
}
