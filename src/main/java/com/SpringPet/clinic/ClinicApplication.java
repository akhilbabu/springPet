package com.SpringPet.clinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import com.SpringPet.clinic.model.ProductDTO;
import com.SpringPet.clinic.repository.ProductRepository;

@SpringBootApplication
public class ClinicApplication implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	private ProductRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(ClinicApplication.class, args);
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		ProductDTO product = new ProductDTO("Detol", "12", "Yes");
		ProductDTO product2 = new ProductDTO("chandrika", "15", "Yes");
		repo.save(product);
		repo.save(product2);
	}

}