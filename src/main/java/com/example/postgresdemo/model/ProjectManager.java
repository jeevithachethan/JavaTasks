package com.example.postgresdemo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @Creating a ProjectManager class
 *
 */
@Entity
@Table
public class ProjectManager {

	/**
	 * Creating a Primary key projectManagerId as Integer
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectManagerId;
	/**
	 * Creating a projectManagername as string
	 */
	@Column
	private String name;
	/**
	 * Creating a emailId of a projectManager as a string
	 */
	@Column
	private String emailId;
	/**
	 * Creating a projectManagername country as stringd
	 */
	@Column
	private String country;
	/**
	 * Project manager class has oneToMany relation with Project class that
	 * referenced by a columnName projectManagerId
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "projectManagerId", referencedColumnName = "projectManagerId ")
	private List<Project> projects;// (One-to-many)

	/**
	 * @return the projectManagerId
	 */
	public Integer getProjectManagerId() {
		return projectManagerId;
	}

	/**
	 * @param projectManagerId the projectManagerId to set
	 */
	public void setProjectManagerId(final Integer projectManagerId) {
		this.projectManagerId = projectManagerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(final String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(final String country) {
		this.country = country;
	}

	/**
	 * @return the projects
	 */
	public List<Project> getProjects() {
		return projects;
	}

	/**
	 * @param projects the projects to set
	 */
	public void setProjects(final List<Project> projects) {
		this.projects = projects;
	}

}
