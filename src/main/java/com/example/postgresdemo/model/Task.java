/**
 * 
 */
package com.example.postgresdemo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @Creating Task class
 *
 */
@Entity
@Table
public class Task {

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", name=" + name + ", developer=" + developer + ", status=" + status
				+ ", colourResult=" + colourResult + ", createdDate=" + createdDate + ", completedDate=" + completedDate
				+ "]";
	}

	/**
	 * @Creating taskId as primarykey
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taskId;
	/**
	 * @Creating name as string
	 *
	 */
	@Column
	private String name;
	/**
	 * @Creating Task class has oneToOne relation withDeveloper class
	 *
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "taskId", referencedColumnName = "taskId")
	private Developer developer;
	/**
	 * @Creating status as string
	 *
	 */
	@Column
	private String status;
	/**
	 * @Creating colourResult as string
	 *
	 */
	@Column
	private String colourResult;
	/**
	 * @Creating createdDate as Date type
	 *
	 */
	@Column
	private Date createdDate;
	/**
	 * @Creating completedDate as Date type
	 *
	 */
	@Column
	private Date completedDate;

	/**
	 * @return the taskId
	 */

	public Integer getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(final Integer taskId) {
		this.taskId = taskId;
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
	 * @return the developer
	 */
	public Developer getDeveloper() {
		return developer;
	}

	/**
	 * @param developer the developer to set
	 */
	public void setDeveloper(final Developer developer) {
		this.developer = developer;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(final String status) {
		this.status = status;
	}

	/**
	 * @return the colourResult
	 */
	public String getColourResult() {
		return colourResult;
	}

	/**
	 * @param colourResult the colourResult to set
	 */
	public void setColourResult(final String colourResult) {
		this.colourResult = colourResult;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(final Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the completedDate
	 */
	public Date getCompletedDate() {
		return completedDate;
	}

	/**
	 * @param completedDate the completedDate to set
	 */
	public void setCompletedDate(final Date completedDate) {
		this.completedDate = completedDate;
	}

}
