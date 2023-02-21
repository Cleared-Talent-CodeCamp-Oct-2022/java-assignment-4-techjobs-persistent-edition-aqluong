package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Employer extends AbstractEntity {
    //    Employer should have a string field for location.✅
//    Add the field for location with validation that ensures it is not empty and has a reasonable length.✅
//    In addition, add public accessor methods to Employer.✅
    @Size(min = 1, max = 50)
    @NotNull(message = "Location input is required")
    private String location;

//    no-arg constructor required for Hibernate✅
    public Employer(){
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
