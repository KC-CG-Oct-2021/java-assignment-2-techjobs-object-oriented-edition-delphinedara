package org.launchcode.techjobs.oo;

import java.util.Objects;



public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    String emptyFieldMessage = "Data not available";

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); //initialize id field
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //toString Method
    @Override
    public String toString() {
        //Bonus --to finish later
//        if (this.employer.getValue().equals("") && this.name.equals("") && this.location.getValue().equals("") && this.positionType.getValue().equals("") && this.coreCompetency.getValue().equals("")) {
//            return "OOPS! This job does not exist.";
//        }

        String nameValue = this.name;
        String employerValue = this.getEmployer().toString();
        String locationValue = this.getLocation().toString();
        String positionTypeValue = this.getPositionType().toString();
        String coreCompetencyValue = this.getCoreCompetency().toString();

        //Empty field, return data not available

        if (nameValue.equals("") || nameValue == null) {
            nameValue =emptyFieldMessage;
        }

        if (this.employer.getValue().equals("") || this.employer.getValue() == null) {
            employerValue =emptyFieldMessage;
        }

        if (this.location.getValue().equals("") || this.location.getValue() == null) {
            locationValue =emptyFieldMessage;
        }

        if (this.positionType.getValue().equals("") || this.positionType.getValue() == null) {
            positionTypeValue =emptyFieldMessage;
        }

        if (this.coreCompetency.getValue().equals("") || this.coreCompetency.getValue() == null) {
            coreCompetencyValue =emptyFieldMessage;
        }


        //When passed a Job object, it should return a string that contains a blank line before and after the job information
        //The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
        //String[] labels= {"ID: ", "Name: ", "Employer: ", "Location: ", "Position Type: ", "Core Competency: "};

        return "\nID: " + id +
                "\nName: " + nameValue +
                "\nEmployer: " + employerValue +
                "\nLocation: " + locationValue +
                "\nPosition Type: " + positionTypeValue +
                "\nCore Competency: " + coreCompetencyValue + "\n";
    }


}




