package com.example.Springbootassignment.model;

public class ProjectModel {

    private String name;
    private String description;
    private String monthOfCompletion;

    private String email;

    public ProjectModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMonthOfCompletion() {
        return monthOfCompletion;
    }

    public void setMonthOfCompletion(String monthOfCompletion) {
        this.monthOfCompletion = monthOfCompletion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ProjectModel{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", monthOfCompletion='" + monthOfCompletion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
