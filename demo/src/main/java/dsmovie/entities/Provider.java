package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_provider")
public class Provider {

	@EmbeddedId
	private ProviderPK id = new ProviderPK();
	
	private Double value;
	
	public Provider() {
	}
	
	public void setMovie(RawMaterial rawMaterial) {
		id.setMaterial(rawMaterial);
	}
	
	public void setUser(Product product) {
		id.setProduct(product);
	}

	public ProviderPK getId() {
		return id;
	}

	public void setId(ProviderPK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
