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

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
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
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        String stringID = String.valueOf(this.getId());

        String stringName;
        if (this.name == null || this.name == "") {
            stringName = "Data not available";
        } else {
            stringName = String.valueOf(this.getName());
        }

        String stringEmployer;
        if (this.employer.getValue() == null || this.employer.getValue() == "") {
            stringEmployer = "Data not available";
        } else {
            stringEmployer = String.valueOf(this.getEmployer());
        }

        String stringLocation;
        if (this.location.getValue() == null || this.location.getValue() == "") {
            stringLocation = "Data not available";
        } else {
            stringLocation = String.valueOf(this.getLocation());
        }

        String stringPositionType;
        if (this.positionType.getValue() == null || this.positionType.getValue() == "") {
            stringPositionType = "Data not available";
        } else {
            stringPositionType = String.valueOf(this.getPositionType());
        }

        String stringCoreCompetency;
        if (this.coreCompetency.getValue() == null || this.getCoreCompetency().getValue() == "") {
            stringCoreCompetency = "Data not available";
        } else {
            stringCoreCompetency = String.valueOf(this.getCoreCompetency());
        }

        return "\n" +
                "ID: " + stringID + "\n" +
                "Name: " + stringName + "\n" +
                "Employer: " + stringEmployer + "\n" +
                "Location: " + stringLocation + "\n" +
                "Position Type: " + stringPositionType + "\n" +
                "Core Competency: " + stringCoreCompetency + "\n";

    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


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

    public int getId() {
        return id;
    }
}
