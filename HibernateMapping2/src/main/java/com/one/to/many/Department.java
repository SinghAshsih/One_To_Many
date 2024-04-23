package com.one.to.many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@Column(name = "d_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int d_Id;
	private String D_Name;
	private String location;

	@OneToMany(mappedBy = "department")
	private List<Employee> employee;

	public int getD_Id() {
		return d_Id;
	}

	public void setD_Id(int d_Id) {
		this.d_Id = d_Id;
	}

	public String getD_Name() {
		return D_Name;
	}

	public void setD_Name(String d_Name) {
		D_Name = d_Name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}