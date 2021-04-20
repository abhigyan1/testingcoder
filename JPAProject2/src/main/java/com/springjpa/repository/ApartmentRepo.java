package com.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.model.Apartment;

@Repository
public interface ApartmentRepo extends JpaRepository<Apartment, Long> {

}
