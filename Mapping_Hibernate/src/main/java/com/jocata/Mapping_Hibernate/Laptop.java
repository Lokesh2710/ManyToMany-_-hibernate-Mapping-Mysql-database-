package com.jocata.Mapping_Hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	

	@Id
	private int laptop_id;
	private String laptop_name;
	
	@ManyToMany
	private List<Student> student = new ArrayList<Student>();
	
	public int getLaptop_id() {
		return laptop_id;
	}
	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}
	public String getLaptop_name() {
		return laptop_name;
	}
	public void setLaptop_name(String string) {
		this.laptop_name = string;
	}
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	
	
	

}
