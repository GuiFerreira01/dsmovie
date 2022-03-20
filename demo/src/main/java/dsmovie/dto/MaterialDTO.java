package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.RawMaterial;

public class MaterialDTO {

	private Long id;
	private String name;
	private int amount;
	
	public MaterialDTO() {
	}

	public MaterialDTO(Long id, String name, int amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	public MaterialDTO(RawMaterial rawMaterial) {
		id = rawMaterial.getId();
		name = rawMaterial.getName();
		amount = rawMaterial.getAmount();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
