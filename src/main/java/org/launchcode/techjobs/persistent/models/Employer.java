package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    //    Employer should have a string field for location.✅
//    Add the field for location with validation that ensures it is not empty and has a reasonable length.✅
//    In addition, add public accessor methods to Employer.✅
    @Size(min = 1, max = 50, message = "Please keep Employer name under 50 characters.")
    @NotNull(message = "Location input is required")
    private String location;

//    Use the @OneToMany and @JoinColumn annotations on the jobs list in Employer to declare the relationship between data tables.✅
    @OneToMany
@JoinColumn
    private List<Job> jobs = new ArrayList<>();
    //    private property jobs of type List<Job> and initialize it to an empty ArrayList.✅

    //    no-arg constructor required for Hibernate✅
    public Employer(){
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
