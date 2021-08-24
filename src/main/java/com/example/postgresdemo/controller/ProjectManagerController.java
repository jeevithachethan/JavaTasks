package com.example.postgresdemo.controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.ProjectManager;
import com.example.postgresdemo.model.Task;
import com.example.postgresdemo.service.ProjectManagerService;

/**
 * @author ProjectManagerController
 *
 */
@RestController
public class ProjectManagerController {
	private Logger logger = Logger.getLogger(ProjectManagerController.class.getName());

	@Autowired
	private ProjectManagerService projectManagerService;

	/**
	 * Create 1 API which will calculate the color of each task of project by
	 * passing projecManagerId.
	 */

	@GetMapping("color/{projectManagerId}")
	public List<Task> updateColorsOfTask(@PathVariable final Integer projectManagerId) {
		try {
			logger.info("Upadated task color successfully for the projectManagerId : " + projectManagerId);

			return projectManagerService.getColorOfProjectId(projectManagerId);

		} catch (Exception e) {

			logger.info("Error: Fail to update task color of projectManagerId" + projectManagerId);

			

			logger.info("Error : ProjectManagerController:updateColorsOfTask  " + e.getMessage());

		}
		return null;
	}

	/**
	 * create one API which will return the Project Manager object having highest
	 * task completed.
	 */

	@GetMapping("taskCompletion")
	public Optional<ProjectManager> fetchProjectManager() {
		return projectManagerService.getProjectManager();
	}

}
