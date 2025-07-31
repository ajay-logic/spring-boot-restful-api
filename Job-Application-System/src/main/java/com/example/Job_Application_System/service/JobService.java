package com.example.Job_Application_System.service;

import com.example.Job_Application_System.model.JobApply;
import com.example.Job_Application_System.model.Jobs;
import com.example.Job_Application_System.repository.ApplicationRepo;
import com.example.Job_Application_System.repository.JobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.core.support.PersistenceExceptionTranslationRepositoryProxyPostProcessor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo jobRepo;
    @Autowired
    ApplicationRepo applicationRepo;

    public List<Jobs> availableJobs() { // can Assign the values in MySql
        Jobs j1 = new Jobs  (50, "Graphic Designer", 4, "Experience");
        Jobs j2 = new Jobs  (51, "UI/UX Designer", 5, "Fresher");
        Jobs j3 = new Jobs  (52, "Animator", 8, "Fresher");
        Jobs j4 = new Jobs  (53, "VFX Artist", 3, "Experience");
        Jobs j5 = new Jobs  (54, "AR/VR", 6, "Fresher");
        List<Jobs> jobs = Arrays.asList(j1, j2,j3, j4, j5);
        jobRepo.saveAll(jobs);

        return jobRepo.findAll();
    }

    public void jobApplication(String name, String email, int experience, String role) {
        JobApply applied = new JobApply(name, email, experience, role);
        applicationRepo.save(applied);
    }

    public List<JobApply> getAllAppllication() {

        return applicationRepo.findAll();
    }
    public Page<JobApply> getAllAplicationsByPage(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return applicationRepo.findAll(pageable);
    }
    public List <JobApply> filterApplication(String jobRole) {


       return applicationRepo.findByJobRole(jobRole);

    }

    public void addingJob(int jobId, String role, int vacancy, String candidate) {
        Jobs added =  new Jobs (jobId,role, vacancy, candidate);
        jobRepo.save(added);
    }
@Transactional
    public boolean rejectApplication(int id) {
        if (applicationRepo.existsById(id)) {
            applicationRepo.deleteById(id);
            return true;
        }
            else {
            return false;
        }
    }
}


