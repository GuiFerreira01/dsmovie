package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MaterialDTO;
import com.devsuperior.dsmovie.dto.ProductDTO;
import com.devsuperior.dsmovie.entities.RawMaterial;
import com.devsuperior.dsmovie.services.MaterialService;

@RestController
@RequestMapping(value = "/Materials")
public class MaterialController {

	@Autowired
	private MaterialService service;
	
	@GetMapping
	public Page<MaterialDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public MaterialDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/teste")
	public RawMaterial saveMaterial(@RequestBody RawMaterial material) {
		return service.saveMaterial(material);
	}
	
	
}
