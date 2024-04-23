package com.one.to.many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "e_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int E_Id;
	private String E_Name;
	private int age;

	@ManyToOne
	@JoinColumn(name = "d_Id")
	private Department department;

	public int getE_Id() {
		return E_Id;
	}

	public void setE_Id(int e_Id) {
		E_Id = e_Id;
	}

	public String getE_Name() {
		return E_Name;
	}

	public void setE_Name(String e_Name) {
		E_Name = e_Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}