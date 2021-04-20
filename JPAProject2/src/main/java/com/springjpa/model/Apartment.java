package com.springjpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
@Entity
public class Apartment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int apartmentid;
private String name;
private int size;
@JsonProperty
private boolean isParkingFree;
private Apartmentroom apaEnum;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public boolean isParkingFree() {
	return isParkingFree;
}
public void setParkingFree(boolean isParkingFree) {
	this.isParkingFree = isParkingFree;
}
public Apartmentroom getApaEnum() {
	return apaEnum;
}
public void setApaEnum(Apartmentroom apaEnum) {
	this.apaEnum = apaEnum;
}
public int getApartmentid() {
	return apartmentid;
}
public void setApartmentid(int apartmentid) {
	this.apartmentid = apartmentid;
}
public Apartment(String name, int size, boolean isParkingFree, Apartmentroom apaEnum) {
	super();
	this.name = name;
	this.size = size;
	this.isParkingFree=isParkingFree;
	this.apaEnum= apaEnum;
}
public Apartment() {
	super();
}

}
