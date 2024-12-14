package hpi.ulpgc.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int NEXT_ID = 0;
    private final int id;
    private String name;
    private String email;
    private String password;

    private final List<String> skills;
    private final List<String> goals;

    private Revenue revenue;

    public User(String name, String email, String password, String[] skills, String[] goals, Revenue revenue) {
        this.id = NEXT_ID++;
        this.name = name;
        this.email = email;
        this.password = password;
        this.skills = new ArrayList<>();
        this.goals = new ArrayList<>();
        this.revenue = revenue;
    }

    public int getId() {
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

    public List<String> getSkills() {
        return skills;
    }

    public List<String> getGoals() {
        return goals;
    }

    public Revenue getRevenue() {
        return revenue;
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

    public void addSkill(String skill) {

        skills.add(skill);
    }

    public void addGoal(String goal) {
        goals.add(goal);
    }

    public void setRevenue(Revenue revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", skills=" + skills +
                ", goals=" + goals +
                ", revenue=" + revenue +
                '}';
    }
}
