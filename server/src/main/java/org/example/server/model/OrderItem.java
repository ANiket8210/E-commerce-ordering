package org.example.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

@Entity
public class OrderItem {

     @Id
     private Long id;
     @ManyToOne
     private Product product;
     int quantity;
     private BigDecimal totalPrice;
     @ManyToOne(fetch = FetchType.LAZY)
     private Order order;
}
