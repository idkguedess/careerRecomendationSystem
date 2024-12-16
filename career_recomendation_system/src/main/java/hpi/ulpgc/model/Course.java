package hpi.ulpgc.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String title;
    String category;
    String description;
    double price;
    String location;
    public List<User> users;

    public Course(String title, String category, String description, double price, String location) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.price = price;
        this.location = location;
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
            user.addCourse(this);  // Asegurar la bidireccionalidad
        }
    }

    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
            user.removeCourse(this); // Mantener la bidireccionalidad
        }
    }

    public String getTitle() {
        return title;
    }

    public List<User> getStudents() {
        return users;
    }
}