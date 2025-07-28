package com.example.Job_Application_System.repository;

import com.example.Job_Application_System.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Jobs, Integer> {




}
