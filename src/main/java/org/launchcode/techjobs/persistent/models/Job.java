package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Update the class definition of Job to extend AbstractEntity.✅
@Entity
public class Job extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;

//    private String name;
@ManyToOne
    private Employer employer;
//    private String skills;
//Update your Job model class to fit its many-to-many relationship with skills.
    @ManyToMany
    private List<Skill> skills = new ArrayList<>();
    public Job() {
    }
// Refactor affected constructor and getter and setter that use Employer class✅

    public Job(Employer employer, List<Skill> skills) {
        super();
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

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
