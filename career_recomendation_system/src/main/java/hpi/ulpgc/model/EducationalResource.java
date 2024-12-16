package hpi.ulpgc.model;

import java.util.List;
import java.util.ArrayList;

public class EducationalResource {
    public String title;
    public String description;
    public ResourceCategory category;
    private Revenue revenue;
    public List<User> users;

    public EducationalResource(String title, String description, ResourceCategory category, Revenue revenue) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.revenue = revenue;
        this.users = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ResourceCategory getCategory() {
        return category;
    }

    public void setCategory(ResourceCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Revenue getRevenue() {
        return revenue;
    }

    public void setRevenue(Revenue revenue) {
        this.revenue = revenue;
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
            user.addEducationalResource(this); // Asegurar la bidireccionalidad
        }
    }

    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
            user.removeEducationalResource(this); // Mantener la bidireccionalidad
        }
    }

    public List<User> getUsers() {
        return users;
    }
}