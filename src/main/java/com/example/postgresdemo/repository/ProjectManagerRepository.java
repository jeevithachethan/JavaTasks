package com.example.postgresdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Developer;
import com.example.postgresdemo.model.ProjectManager;
import com.example.postgresdemo.model.Status;
import com.example.postgresdemo.model.Task;
/**
 * @author ProjectManagerRepository
 * 
 */
@Repository
public interface ProjectManagerRepository extends JpaRepository<ProjectManager, Integer> {
	@Query(value = "SELECT t from ProjectManager pm join pm.projects p join p.tasks t where pm.projectManagerId=:projectManagerId")
	List<Task> findProjectManagerById(@Param(value="projectManagerId")Integer projectManagerId);

	@Query(value = "select  pm.project_manager_id from project_manager pm\r\n"
			+ "inner join project p on pm.project_manager_id=p.project_manager_id\r\n"
			+ "inner join task t on p.project_id=t.project_id\r\n"
			+ "inner join developer d on t.developer_id=d.developer_id\r\n"
			+ "inner join status s on d.status_id=s.status_id\r\n"
			+ "WHERE t.\"status\" = 'Done'\r\n"
			+ "ORDER BY s.complete_count DESC  limit 1", nativeQuery = true)
	Integer fetchProjectManager();
	/* create one API which will return developer object having less number of todo task.*/
	
	
}	