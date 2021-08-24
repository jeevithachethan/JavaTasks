package com.example.postgresdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Developer;
import com.example.postgresdemo.service.DeveloperService;

/**
 * DeveloperController
 */
@RestController
public class DeveloperController {

	@Autowired
	private DeveloperService developerService;

	/**
	 * Create 1 API which will return the status of every developer. (status means
	 * count of todo, count of Done, count of Doing)
	 */
	@GetMapping("status")
	public Developer getStatusByDeveloper(final Developer developer) {

		return developerService.findStatusByDeveloper();

	}

	/**
	 * create one API which will return developer object having less number of todo
	 * task
	 */

	@GetMapping("taskTodo")
	public Optional<Developer> fetchDeveloper() {
		return developerService.getDeveloper();
	}

}
