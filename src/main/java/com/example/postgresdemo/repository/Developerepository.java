package com.example.postgresdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.postgresdemo.model.Developer;

/**
 * @author DeveloperService
 * 
 */
@Repository
public interface Developerepository extends JpaRepository<Developer, Integer> {
	@Query(value = "select d from Task t join t.developer d join d.staus s where t.status='TODO' and d.developerId=:developerId")
	List<Developer> findStatustodo(Integer developerId);

	@Query(value = "select d from Task t join t.developer d join d.staus s where t.status='Doing' and d.developerId=:developerId")
	List<Developer> findStatusDoing(Integer developerId);

	@Query(value = "select d from Task t join t.developer d join d.staus s where t.status='Done' and d.developerId=:developerId")
	List<Developer> findStatusDone(Integer developerId);

	@Query(value = "SELECT d.developer_id from task t \r\n"
			+ "inner join developer d on  t.developer_id=d.developer_id\r\n"
			+ "inner join status s on d.status_id=s.status_id\r\n"
			+ "where t.\"status\"='Todo' ORDER BY s.to_do_count  ASC limit 1", nativeQuery = true)
	Integer fetchDeveloper();
}
