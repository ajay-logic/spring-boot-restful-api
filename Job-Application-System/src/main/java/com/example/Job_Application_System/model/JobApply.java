package com.example.Job_Application_System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobApply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String candidateName;
    private String emailId;
    private int yearOfExperience;
    private String jobRole;

    public JobApply(String candidateName, String emailId, int yearOfExperience, String jobRole) {
        this.candidateName = candidateName;
        this.emailId = emailId;
        this.yearOfExperience = yearOfExperience;
        this.jobRole = jobRole;
    }

    public JobApply() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
}
