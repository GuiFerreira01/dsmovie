package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MaterialDTO;
import com.devsuperior.dsmovie.dto.ProductDTO;
import com.devsuperior.dsmovie.services.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping
	public MaterialDTO saveProduct(@RequestBody ProductDTO dto) {
		MaterialDTO materialDTO = service.saveProduct(dto);
		return materialDTO;
	}
	
	
}
