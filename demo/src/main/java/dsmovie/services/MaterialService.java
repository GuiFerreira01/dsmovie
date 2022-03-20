package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MaterialDTO;
import com.devsuperior.dsmovie.dto.ProductDTO;
import com.devsuperior.dsmovie.entities.Product;
import com.devsuperior.dsmovie.entities.RawMaterial;
import com.devsuperior.dsmovie.repositories.MaterialRepository;

@Service
public class MaterialService {

	@Autowired
	private MaterialRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MaterialDTO> findAll(Pageable pageable) {
		Page<RawMaterial> result = repository.findAll(pageable);
		Page<MaterialDTO> page = result.map(x -> new MaterialDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MaterialDTO findById(Long id) {
		RawMaterial result = repository.findById(id).get();
		MaterialDTO dto = new MaterialDTO(result);
		return dto;
	}
	
	
	@Transactional
	public RawMaterial saveMaterial(RawMaterial material) {
		return repository.save(material);
	}
}
