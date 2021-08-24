package com.example.postgresdemo.service;

import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postgresdemo.model.Task;
import com.example.postgresdemo.repository.TaskRepository;

@Service
public class CalculateTimeService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Task calculate(Task task) throws ParseException {
		Date startDate = task.getCreatedDate();
		Date endDate = task.getCompletedDate();

		long diffInMillies = Math.abs(endDate.getTime() - startDate.getTime());
		long differenceinDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

		if (differenceinDays > 0 && differenceinDays < 3) {
			task.setColourResult("Red");

			return task;
		}

		if (differenceinDays > 3 && differenceinDays < 7) {
			task.setColourResult("Orange");

			return task;
		}
		if (differenceinDays > 7 && differenceinDays < 15) {
			task.setColourResult("Yellow");

			return task;
		}
		if (differenceinDays > 15 && differenceinDays < 30) {
			task.setColourResult("Green");
			return task;
		}
		return task;

	}
}
