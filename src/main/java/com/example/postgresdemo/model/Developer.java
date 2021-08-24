package com.example.postgresdemo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
/**
 * @author electem 2
 *
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @Creating Developer class
 *
 */
@Entity
@Table
public class Developer {

	/**
	 * @Creating DeveloperId as primary key of Developer class
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer developerId;
	/**
	 * declaring emailId
	 *
	 */
	@Column
	private String emailId;
	/**
	 * @Creating developerName as String type
	 *
	 */
	@Column
	private String developerName;
	/**
	 * joining Developer table with Status table by oneToOne Relation
	 *
	 */

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "statusId")
	private Status staus;

	/**
	 * @return the developerId
	 */
	public Integer getDeveloperId() {
		return developerId;
	}

	/**
	 * @param developerId the developerId to set
	 */
	public void setDeveloperId(final Integer developerId) {
		this.developerId = developerId;
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
	 * @return the developerName
	 */
	public String getDeveloperName() {
		return developerName;
	}

	/**
	 * @param developerName the developerName to set
	 */
	public void setDeveloperName(final String developerName) {
		this.developerName = developerName;
	}

	/**
	 * @return the staus
	 */
	
	public Status getStaus() {
		return staus;
	}

	/**
	 * @param staus the staus to set
	 */
	public void setStaus(final Status staus) {
		this.staus = staus;
	}

}
