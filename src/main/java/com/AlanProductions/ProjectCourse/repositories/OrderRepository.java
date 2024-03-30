package com.AlanProductions.ProjectCourse.repositories;

import com.AlanProductions.ProjectCourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
