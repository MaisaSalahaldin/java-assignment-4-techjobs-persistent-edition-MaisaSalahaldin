package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{



    @ManyToOne
    private Employer employer;
    //private String skills;
    @ManyToMany
    private List<Skill> skills=new ArrayList<>();
    public Job() {
    }

//    public Job(Employer anEmployer, String someSkills) {
//        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }

    public Job(Employer employer, List<Skill> skills) {
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.



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
