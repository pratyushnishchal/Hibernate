package com.mapping2;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	private int id;
	@Column(name="project_name")
	private String projectName;
	@ManyToMany(mappedBy = "project")
	private List<Emp> emps;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int id, String projectName, List<Emp> emps) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.emps = emps;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", emps=" + emps + "]";
	}
	
	
}
