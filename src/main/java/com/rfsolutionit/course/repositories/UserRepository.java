package com.rfsolutionit.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfsolutionit.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
