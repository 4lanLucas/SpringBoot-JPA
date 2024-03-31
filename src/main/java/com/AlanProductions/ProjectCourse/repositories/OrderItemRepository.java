package com.AlanProductions.ProjectCourse.repositories;

import com.AlanProductions.ProjectCourse.entities.OrderItem;
import com.AlanProductions.ProjectCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
