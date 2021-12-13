package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.demo.model.Order1;
import com.demo.model.OrderPosition;
import com.demo.repo.OrderPositionRepo;
import com.demo.repo.OrderRepo;

@Component
public class MyRunner implements CommandLineRunner {

  @Autowired
  OrderRepo or;
  
  @Autowired
  OrderPositionRepo opr;
  
  @Override
  public void run(String... args) throws Exception {

    Order1 o1 = new Order1();
    o1.setCustomer("customer-1");
    
    OrderPosition op1 = new OrderPosition();
    op1.setProduct("product-1");
    op1.setQuantity(4);
    op1.setOrder(o1);
    
    o1.getPositions().add(op1);
    
    or.save(o1);
    opr.save(op1);
    
  }

}
