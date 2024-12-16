package hpi.ulpgc.model;

import java.util.ArrayList;
import java.util.List;

public class CarreerSystem {
    public List<User> users = new ArrayList<>();
    public List<String> skills = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();
    public List<EducationalResource> resources = new ArrayList<>();

    public User createUser(String name, String email) {
        List<String> initialSkills = new ArrayList<>();  // Crea listas vacías o inicialízalas según necesites
        List<Course> initialCourses = new ArrayList<>();
        User newUser = new User(name, email, (ArrayList<String>) initialSkills, (ArrayList<Course>) initialCourses);
        users.add(newUser);
        return newUser;
    }

    public Course createCourse(String title, String category, String description, double price, String location) {
        Course newCourse = new Course(title, category, description, price, location);
        courses.add(newCourse);
        return newCourse;
    }

    public EducationalResource createEducationalResource(String title, String description, ResourceCategory category, Revenue revenue) {
        EducationalResource newResource = new EducationalResource(title, description, category, revenue);
        resources.add(newResource);
        return newResource;
    }

    public void createSystem() {
        // Crear algunos usuarios
        User alice = createUser("Alice", "alice@example.com");
        User bob = createUser("Bob", "bob@example.com");

        // Crear algunos cursos
        Course javaCourse = createCourse("Java 101", "Programming", "Introductory course to Java", 299.99, "Online");
        Course mlCourse = createCourse("Machine Learning", "Data Science", "Comprehensive ML course", 499.99, "Online");

        // Crear algunos recursos educativos
        Revenue revenueFree = new Revenue(RevenueModel.FREE, 0);
        Revenue revenueSubscription = new Revenue(RevenueModel.SUBSCRIPTION, 19.99);
        EducationalResource resource1 = createEducationalResource("Intro to Python", "Python from scratch", ResourceCategory.COURSE, revenueFree);
        EducationalResource resource2 = createEducationalResource("Advanced Java", "Deep dive into Java", ResourceCategory.MASTERCLASS, revenueSubscription);

        // Establecer relaciones iniciales
        alice.addCourse(javaCourse);
        bob.addCourse(mlCourse);

        alice.addEducationalResource(resource1);
        bob.addEducationalResource(resource2);
    }
}