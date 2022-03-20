package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Provider;
import com.devsuperior.dsmovie.entities.ProviderPK;

public interface ProviderRepository extends JpaRepository<Provider, ProviderPK> {

	
}
