package com.AlanProductions.ProjectCourse.repositories;

import com.AlanProductions.ProjectCourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
