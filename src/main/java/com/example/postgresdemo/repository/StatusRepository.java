package com.example.postgresdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Status;
import com.example.postgresdemo.model.Task;
@Repository
public interface StatusRepository extends JpaRepository<Status, Integer>{

	

	

}
