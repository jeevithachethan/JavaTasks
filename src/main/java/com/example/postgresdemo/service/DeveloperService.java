/**
 * 
 */
package com.example.postgresdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postgresdemo.model.Developer;
import com.example.postgresdemo.repository.Developerepository;

/**
 * @author DeveloperService
 * 
 */
@Service
public class DeveloperService {

	@Autowired
	private Developerepository developerepository;

	/**
	 * Create 1 API which will return the status of every developer. (status means
	 * count of todo, count of Done, count of Doing)
	 * 
	 */

	public Developer findStatusByDeveloper() {

		final List<Developer> developerList = developerepository.findAll();

		for (final Developer developer : developerList) {

			final List<Developer> statusOfDOing = developerepository.findStatusDoing(developer.getDeveloperId());
			developer.getStaus().setCurrentlyDoingCount(statusOfDOing.size());

			final List<Developer> statusToTodo = developerepository.findStatustodo(developer.getDeveloperId());
			developer.getStaus().setCurrentlyDoingCount(statusToTodo.size());

			final List<Developer> statusToDone = developerepository.findStatusDone(developer.getDeveloperId());
			developer.getStaus().setCurrentlyDoingCount(statusToDone.size());

			if (developer.getDeveloperId() != null) {
				developerepository.save(developer);
			}
		}
		return null;
	}

	/**
	 * create one API which will return developer object having less number of todo
	 * task
	 */
	public Optional<Developer> getDeveloper() {

		Integer developer = developerepository.fetchDeveloper();
		final Optional<Developer> developerObj = developerepository.findById(developer);
		return developerObj;
	}

}
