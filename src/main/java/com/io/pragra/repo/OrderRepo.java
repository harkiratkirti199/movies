package com.io.pragra.repo;

import com.io.pragra.domain.Movie;
import com.io.pragra.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order,Long> {

    List<Order> findAllById(Long id);

}
