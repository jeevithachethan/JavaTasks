package com.example.postgresdemo.service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postgresdemo.model.ProjectManager;
import com.example.postgresdemo.model.Task;
import com.example.postgresdemo.repository.Developerepository;
import com.example.postgresdemo.repository.ProjectManagerRepository;
import com.example.postgresdemo.repository.StatusRepository;
import com.example.postgresdemo.repository.TaskRepository;

@Service
public class ProjectManagerService {

	@Autowired
	private CalculateTimeService calculateTimeService;
	
	@Autowired
	private ProjectManagerRepository projectmManagerRepository;
	
	@Autowired
	private TaskRepository taskRepository;

	/**
	 * Fetching colors of a task by ProjectManagerId
	 */

	public List<Task> getColorOfProjectId(final Integer projectManagerId) throws ParseException {
		final List<Task> tasks = projectmManagerRepository.findProjectManagerById(projectManagerId);

		for (final Task task : tasks) {
			calculateTimeService.calculate(task);
			taskRepository.save(task);

		}
		return tasks;
	}

	/**
	 * Fetching the projectManager who will have highest tasks tobe Done
	 */

	public Optional<ProjectManager> getProjectManager() {
		final Integer projectManager = projectmManagerRepository.fetchProjectManager();
		return  projectmManagerRepository.findById(projectManager);
	}

}