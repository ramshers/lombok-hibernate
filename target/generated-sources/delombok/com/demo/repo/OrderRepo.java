package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.demo.model.Order1;

public interface OrderRepo extends JpaRepository<Order1, Long>, JpaSpecificationExecutor<Order1> {

}
