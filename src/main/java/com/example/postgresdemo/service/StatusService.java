package com.example.postgresdemo.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.postgresdemo.model.Status;
import com.example.postgresdemo.model.Task;

@Service
public class StatusService {

	/*
	 * public List<Status> getDeveloperStatus(Task developerTask) { Date endDate =
	 * developerTask.getCompletedDate(); Date startDate =
	 * developerTask.getCreatedDate(); Date today = new Date(); List<Status>
	 * count=0; if (developerTask != null) { if (endDate.getDay() > today.getDay())
	 * { developerTask.setStatus("ToDo"); count=count++; return count; } if
	 * (endDate.getDay() < today.getDay()) { developerTask.setStatus("Done");
	 * count=count++; return count; } if (startDate.getDay() < today.getDay() ||
	 * endDate.getDay() > today.getDay()) { developerTask.setStatus("Doing");
	 * count=count++; return count; }
	 * 
	 * } return null;
	 * 
	 * }
	 */
}
