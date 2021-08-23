package com.example.postgresdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Task;
import com.example.postgresdemo.service.ProjectManagerService;
/**
 * @author ProjectManagerController
 *
 */
@RestController
public class ProjectManagerController {
	@Autowired
	private ProjectManagerService projectManagerService;
	// Create 1 API which will calculate the color of each task of project by passing projecManagerId.

	@GetMapping("color/{projectManagerId}")
	public List<Task> updateColorsOfTask(@PathVariable Integer projectManagerId) {
		try {
			System.out.println("Upadated task color successfully for the projectManagerId : " + projectManagerId);
			
			return projectManagerService.getColorOfProjectId(projectManagerId);

		} catch (Exception e) {
			
			System.out.println("Error: Fail to update task color of projectManagerId" + projectManagerId);
			
			e.printStackTrace();
			
			System.out.println("Error : ProjectManagerController:updateColorsOfTask  " + e.getMessage());

		}
		return null;
	}

}
