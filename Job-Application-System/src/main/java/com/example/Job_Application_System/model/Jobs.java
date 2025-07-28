package com.example.Job_Application_System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jobs {
    @Id
    private int jobId;
    private String jobRole;
    private int vacancy;
    private String candidate;

    public Jobs() {
    }

    public Jobs(int jobId, String jobRole, int vacancy, String candidate) {
        this.jobId = jobId;
        this.jobRole = jobRole;
        this.vacancy = vacancy;
        this.candidate = candidate;


    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }
}
