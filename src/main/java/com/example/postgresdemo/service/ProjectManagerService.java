package com.example.postgresdemo.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postgresdemo.model.Task;
import com.example.postgresdemo.repository.ProjectManagerRepository;

@Service
public class ProjectManagerService {
	
	@Autowired
	private CalculateTimeService calculateTimeService;
	
	@Autowired
	private ProjectManagerRepository projectmManagerRepository;

	public List<Task> getColorOfProjectId(Integer projectManagerId) throws ParseException {
		List<Task> tasks = projectmManagerRepository.findProjectManagerById(projectManagerId);
	

		for (final Task task : tasks) {
			calculateTimeService.calculate(task);
		}
		return tasks;
	}

}