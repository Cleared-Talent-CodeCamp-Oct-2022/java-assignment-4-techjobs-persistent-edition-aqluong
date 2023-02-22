package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
//Update the class definition of Job to extend AbstractEntity.✅
@Entity
public class Job extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;

//    private String name;
@ManyToOne
    private Employer employer;
    private String skills;

    public Job() {
    }
// Refactor affected constructor and getter and setter that use Employer class✅
    public Job(Employer employer, String skills) {
        this.employer = employer;
        this.skills = skills;
    }

// Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
