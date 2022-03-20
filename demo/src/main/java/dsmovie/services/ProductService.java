package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MaterialDTO;
import com.devsuperior.dsmovie.dto.ProductDTO;
import com.devsuperior.dsmovie.entities.Product;
import com.devsuperior.dsmovie.entities.RawMaterial;
import com.devsuperior.dsmovie.repositories.MaterialRepository;
import com.devsuperior.dsmovie.repositories.ProductRepository;
import com.devsuperior.dsmovie.repositories.ProviderRepository;

@Service
public class ProductService {

	@Autowired
	private MaterialRepository materialRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProviderRepository providerRepository;
	
	@Transactional
	public MaterialDTO saveProduct(ProductDTO dto) {
		
		Product product = (Product) productRepository.findByName(dto.getName());
		if (product != null) {
			
			return null;
		}
		
		product = new Product();
		product.setName(dto.getName());
		product.setCost(dto.getCost());
		product.setAmount(dto.getAmount());
		
		product = productRepository.saveAndFlush(product);
		
		Product productid = (Product) productRepository.findByName(dto.getName());
		
		
		return null;
		
		/*
		RawMaterial material = materialRepository.findById(dto.getRawMaterialId()).get();
		
		Product product = new Product();
		product.setMovie(movie);
		product.setUser(user);
		product.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
		for (Score s : movie.getScores()) {
			sum = sum + s.getValue();
		}
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
		
		return new MovieDTO(movie);
		
		*/
	}
}
