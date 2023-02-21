package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    //    add a field for a longer description of the skill, named description, ✅
//    with public accessor methods.✅
    @Size(min = 1, max = 100, message = "Please keep descriptons under 100 characters.")
    @NotNull(message = "Please provide a description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//    no-arg constructor.
    public Skill(){
    }
}