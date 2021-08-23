/**
 * 
 */
package com.example.postgresdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Creating a status class
 *
 */
@Entity
@Table
public class Status {

	/**
	 * @Creating statusId as primarykey
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer statusId;
	/**
	 * @Creating currentlyDoingCount as int
	 *
	 */
	@Column
	private int currentlyDoingCount;
	/**
	 * @Creating completeCount as int
	 *
	 */
	@Column
	private int completeCount;
	/**
	 * @Creating toDoCount as int
	 *
	 */

	@Column
	private int toDoCount;

	/**
	 * @return the statusId
	 */
	public Integer getStatusId() {
		return statusId;
	}

	/**
	 * @param statusId the statusId to set
	 */
	public void setStatusId(final Integer statusId) {
		this.statusId = statusId;
	}

	/**
	 * @return the currentlyDoingCount
	 */
	public int getCurrentlyDoingCount() {
		return currentlyDoingCount;
	}

	/**
	 * @param currentlyDoingCount the currentlyDoingCount to set
	 */
	public void setCurrentlyDoingCount(final int currentlyDoingCount) {
		this.currentlyDoingCount = currentlyDoingCount;
	}

	/**
	 * @return the completeCount
	 */
	public int getCompleteCount() {
		return completeCount;
	}

	/**
	 * @param completeCount the completeCount to set
	 */
	public void setCompleteCount(final int completeCount) {
		this.completeCount = completeCount;
	}

	/**
	 * @return the toDoCount
	 */
	public int getToDoCount() {
		return toDoCount;
	}

	/**
	 * @param toDoCount the toDoCount to set
	 */
	public void setToDoCount(final int toDoCount) {
		this.toDoCount = toDoCount;
	}

}
