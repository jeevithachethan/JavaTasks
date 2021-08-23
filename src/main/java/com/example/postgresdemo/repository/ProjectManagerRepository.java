package com.example.postgresdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.ProjectManager;
import com.example.postgresdemo.model.Task;

@Repository
public interface ProjectManagerRepository extends JpaRepository<ProjectManager, Integer> {
	@Query(value = "SELECT t from ProjectManager pm join pm.projects p join p.tasks t where pm.projectManagerId=:projectManagerId")
	List<Task> findProjectManagerById(@Param(value = "projectManagerId") Integer projectManagerId);
}
