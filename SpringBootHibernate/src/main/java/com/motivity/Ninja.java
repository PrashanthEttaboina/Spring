package com.motivity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ninja")
public class Ninja {

	
	@Id
	@Column(name="nid",nullable=false)
	private int id;
	
	@Column(name="name" ,nullable=false)
	private String name;
	
	@Column(name="parentname",nullable=false)
	private String parentname;
	
	@Column(name="age", nullable=false)
	private int age;
	
	@Column(name="squad", nullable=false)
	private int squadno;
	
	@Column(name="village", nullable=false)
	private String village;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentname() {
		return parentname;
	}
	public void setParentname(String parentname) {
		this.parentname = parentname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSquadno() {
		return squadno;
	}
	public void setSquadno(int squadno) {
		this.squadno = squadno;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
		
}
