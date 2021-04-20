package com.springjpa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name ="housemember")
public class HouseMembers {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(insertable = false, updatable = false)
private int memberid;
private String name;
private int age;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "fk_memberid")
private Apartment apartment;
public int getMemberid() {
	return memberid;
}
public void setMemberid(int memberid) {
	this.memberid = memberid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Apartment getApartment() {
	return apartment;
}
public void setApartment(Apartment apartment) {
	this.apartment = apartment;
}
public HouseMembers(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public HouseMembers() {
	super();
}

}
