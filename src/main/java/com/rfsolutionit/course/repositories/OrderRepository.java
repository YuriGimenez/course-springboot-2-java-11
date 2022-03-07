package com.rfsolutionit.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfsolutionit.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
