package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderPosition {
     
    @Id
    @GeneratedValue//(strategy = GenerationType.SEQUENCE)
    private Long id;
 
    private String product;
 
    private int quantity;
 
    @ManyToOne(fetch = FetchType.LAZY)
    private Order1 order;
 
    public Long getId() {
        return id;
    }
 
    public String getProduct() {
        return product;
    }
 
    public void setProduct(String product) {
        this.product = product;
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 
    public Order1 getOrder() {
        return order;
    }
 
    public void setOrder(Order1 order) {
        this.order = order;
    }
 
    @Override
    public int hashCode() {
        return 42;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderPosition other = (OrderPosition) obj;
        if (id == null) {
            return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}