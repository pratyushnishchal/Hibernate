package com.mapping2;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int eid;
	private String name;
	@ManyToMany
	@JoinTable(name = "emp_project_table", joinColumns = { @JoinColumn(name = "eid") }, inverseJoinColumns = {
			@JoinColumn(name = "pid") })
	private List<Project> project;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eid, String name, List<Project> project) {
		super();
		this.eid = eid;
		this.name = name;
		this.project = project;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", project=" + project + "]";
	}

}
