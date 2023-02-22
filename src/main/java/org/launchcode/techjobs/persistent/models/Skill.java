package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

//    @ManyToMany annotation with an argument mappedBy="skills" to configure this mapping.✅
    //    add a field for a longer description of the skill, named description, ✅
//    with public accessor methods.✅
    @Size(min = 1, max = 100, message = "Please keep descriptions under 100 characters.")
    @NotNull(message = "Please provide a description")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    //    no-arg constructor.✅
    public Skill(){
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}