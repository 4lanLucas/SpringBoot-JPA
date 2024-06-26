package com.AlanProductions.ProjectCourse.services;

import com.AlanProductions.ProjectCourse.entities.Product;
import com.AlanProductions.ProjectCourse.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> optional = productRepository.findById(id);
        return optional.get();
    }
}
