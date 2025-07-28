package com.example.Job_Application_System.repository;

import com.example.Job_Application_System.model.JobApply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepo extends JpaRepository <JobApply, Integer>{
    List<JobApply> findByJobRole(String jobRole);
}
