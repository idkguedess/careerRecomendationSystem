package hpi.ulpgc.model;

import java.util.Arrays;

public class user {
    private Long id;
    private String name;
    private String email;
    private String password;

    private String[] skills;
    private String[] goals;

    public void User(Long id, String name, String email, String password, String[] skills, String[] goals) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.skills = skills;
        this.goals = goals;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getSkills() {
        return skills;
    }

    public String[] getGoals() {
        return goals;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public void setGoals(String[] goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", goals=" + Arrays.toString(goals) +
                '}';
    }
}
