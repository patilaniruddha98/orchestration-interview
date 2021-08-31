package com.axis.octate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.octate.interview.model.Interview;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, String> {
	
	
	
	public List<Interview> findByManagerId(String managerId);

}
