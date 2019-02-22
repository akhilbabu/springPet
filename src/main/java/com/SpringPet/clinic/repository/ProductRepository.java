package com.SpringPet.clinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringPet.clinic.model.ProductDTO;

@Repository
public interface ProductRepository extends CrudRepository<ProductDTO, Integer> {
}
