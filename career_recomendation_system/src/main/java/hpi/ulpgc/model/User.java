package hpi.ulpgc.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int NEXT_ID = 0;
    public final int id;
    public String name;
    public String email;
    public List<String> skills;
    public List<Course> courses;
    public List<EducationalResource> resources;

    public User(String name, String email, ArrayList<String> skills, ArrayList<Course> courses) {
        this.id = NEXT_ID++;
        this.name = name;
        this.email = email;
        this.skills = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.resources = new ArrayList<>();
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addUser(this);  // Asegurar la bidireccionalidad
        }
    }

    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            course.removeUser(this); // Mantener la bidireccionalidad
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addEducationalResource(EducationalResource resource) {
        if (!resources.contains(resource)) {
            resources.add(resource);
            resource.addUser(this); // Asegurar la bidireccionalidad
        }
    }

    public void removeEducationalResource(EducationalResource resource) {
        if (resources.contains(resource)) {
            resources.remove(resource);
            resource.removeUser(this); // Mantener la bidireccionalidad
        }
    }

    public List<EducationalResource> getResources() {
        return resources;
    }

    public String getName() {
        return name;
    }
}

