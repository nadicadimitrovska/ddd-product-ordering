package mk.ukim.finki.emt.ordermanagement.domain.model;

import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order extends AbstractEntity<OrderId> {

    private Instant orderOn;

    @Enumerated(EnumType.STRING)
    private OrderState orderState;

    private Money total;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<OrderItem> orderItemList;

    public Order(){

    }
}
