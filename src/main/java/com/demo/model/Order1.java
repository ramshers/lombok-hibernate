package com.demo.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Order1 {
 
    @Id
    @GeneratedValue//(strategy = GenerationType.SEQUENCE)
    private Long id;
 
    private String customer;
 
    @OneToMany//(mappedBy = "order", cascade=CascadeType.ALL)
    private Set<OrderPosition> positions = new HashSet<>();
 
    public Long getId() {
        return id;
    }
    public String getCustomer() {
        return customer;
    }
 
    public void setCustomer(String customer) {
        this.customer = customer;
    }
 
    public Set<OrderPosition> getPositions() {
        return positions;
    }
 
    public void setPositions(Set<OrderPosition> positions) {
        this.positions = positions;
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
        Order1 other = (Order1) obj;
        if (id == null) {
            return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "Order [customer=" + customer + ", id=" + id + "]";
    }
     
}