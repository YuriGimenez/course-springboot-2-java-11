package com.rfsolutionit.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfsolutionit.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
