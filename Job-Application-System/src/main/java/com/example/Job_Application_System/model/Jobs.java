package com.example.Job_Application_System.model;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.Id;


@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Jobs {
    @Id
    private int jobId;
    private String jobRole;
    private int vacancy;
    private String candidate;

}
