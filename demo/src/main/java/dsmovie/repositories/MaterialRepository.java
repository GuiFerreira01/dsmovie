package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.RawMaterial;

public interface MaterialRepository extends JpaRepository<RawMaterial, Long> {

}
