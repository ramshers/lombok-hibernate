package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.demo.model.Order1;
import com.demo.model.OrderPosition;

public interface OrderPositionRepo extends JpaRepository<OrderPosition, Long>, JpaSpecificationExecutor<OrderPosition> {

}
