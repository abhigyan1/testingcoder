package com.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.model.HouseMembers;
@Repository
public interface HouseMemberJPA extends JpaRepository<HouseMembers, Long>{

}
