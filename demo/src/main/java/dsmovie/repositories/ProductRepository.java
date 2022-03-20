package com.devsuperior.dsmovie.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByName(String name);
}
