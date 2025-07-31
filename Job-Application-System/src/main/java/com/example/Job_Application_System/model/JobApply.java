package com.example.Job_Application_System.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;


@Entity

@Getter
@Setter
public class JobApply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Null
    @NotBlank
    private String candidateName;

    @Email
    private String emailId;

    private int yearOfExperience;

    @NotBlank
    private String jobRole;

    public JobApply(String candidateName, String emailId, int yearOfExperience, String jobRole) {
        this.candidateName = candidateName;
        this.emailId = emailId;
        this.yearOfExperience = yearOfExperience;
        this.jobRole = jobRole;
    }

    public JobApply() {
    }

}
