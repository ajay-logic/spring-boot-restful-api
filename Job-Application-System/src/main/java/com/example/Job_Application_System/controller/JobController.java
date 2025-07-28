package com.example.Job_Application_System.controller;

import com.example.Job_Application_System.model.JobApply;
import com.example.Job_Application_System.model.Jobs;
import com.example.Job_Application_System.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;


    // Candidate mapping
    @GetMapping("/availablejob") //for job seeking

    public List<Jobs> availableJobs(){
        return jobService.availableJobs();
    }

    @PostMapping("/jobapplication") // for apply
    public String jopApplication(@RequestParam("candidateName") String name,
                                 @RequestParam("emailId") String email,
                                 @RequestParam("yearOfExperience") int experience,
                                 @RequestParam("jobRole") String role){

        jobService.jobApplication(name, email, experience, role);
        return name + "! Your Application has been sent. for " + role + " role.\n so, please patient for reply.";
    }


    //for admin
    @GetMapping("/admin/applications") //view all applications
    public List<JobApply> getAllApplication(){
        return jobService.getAllAppllication();
    }

    @GetMapping("/admin/applications/filter/{jobRole}") // view specific application by role
    public List<JobApply> filterApplication(@PathVariable("jobRole") String jobRole){
        return jobService.filterApplication(jobRole);
    }
    @PostMapping("/admin/addjob") //post, jop opening

    public String addingJob(@RequestParam("jobId") int jobId,
                            @RequestParam("jobRole") String role,
                            @RequestParam("vacancy") int vacancy,
                            @RequestParam("candidate") String candidate){
        jobService.addingJob(jobId, role, vacancy, candidate);
        return "Your job opening has been posted successfully for " + role + " role." ;
    }

    @DeleteMapping("admin/rejectapplication/{id}") // reject application by id
    public String rejectApplication(@PathVariable ("id")  int id){
        boolean mapping = jobService.rejectApplication(id);
        if (mapping) {

            return "The application with id No. " + id + " has been rejected.";
        }
        else {
            return "There is no application with id No. " + id + ".";
        }
    }

}
