package com.springjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.model.HouseMembers;
import com.springjpa.repository.ApartmentRepo;
import com.springjpa.repository.HouseMemberJPA;

@RestController
public class ApartmentController {
@Autowired
ApartmentRepo apartmentRepo;
@Autowired
HouseMemberJPA houseMemberJPA;
	
@PostMapping("/apt")
	public void  apartmentRecord(@RequestBody HouseMembers hm) {
	houseMemberJPA.save(hm);
	}
	
	@GetMapping("/apt")
	public ResponseEntity<List<HouseMembers>> getapartmentRecord() {
		return ResponseEntity.ok(houseMemberJPA.findAll());
	}

	@GetMapping("/apt/{memberid}")
	public ResponseEntity<Optional<HouseMembers>> getapartmentRecord(@PathVariable long memberid) {
		return ResponseEntity.ok(houseMemberJPA.findById(memberid));
	}
	

	@DeleteMapping("/apt/{id}")
	public String delteApartmentRecord(@PathVariable long id) {
		try {
		houseMemberJPA.deleteById(id);
		return "safely deleted";
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return "not deleted";
		}
		
	}
	

}
