package com.example.postgresdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
	 @Query( value="SELECT t from Task t join t.developer d where d.developerId=:developerId")
			   List<Task> FindDeveloperByID();

	


}
