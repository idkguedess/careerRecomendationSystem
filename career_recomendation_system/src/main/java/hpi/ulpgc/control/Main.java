package hpi.ulpgc.control;
import hpi.ulpgc.model.*;

import java.util.Scanner;

public class Main {
    static CarreerSystem system = new CarreerSystem();

    public static void main(String[] args) {
        system.createSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Career System. Choose an option:");
        System.out.println("1. Add Course to User");
        System.out.println("2. Remove Course from User");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea restante

        switch (choice) {
            case 1:
                addOrRemoveCourse(scanner, true); // true for add
                break;
            case 2:
                addOrRemoveCourse(scanner, false); // false for remove
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

        scanner.close();
    }

    private static void addOrRemoveCourse(Scanner scanner, boolean add) {
        System.out.println("Enter User Name:");
        String name = scanner.nextLine();
        User user = system.users.stream().filter(u -> u.name.equals(name)).findFirst().orElse(null);
        if (user != null) {
            System.out.println("Enter Course Title:");
            String title = scanner.nextLine();
            Course course = system.courses.stream().filter(c -> c.getTitle().equals(title)).findFirst().orElse(null);
            if (course != null) {
                if (add) {
                    user.addCourse(course);
                    System.out.println("Course added successfully!");
                } else {
                    user.removeCourse(course);
                    System.out.println("Course removed successfully!");
                }
            } else {
                System.out.println("Course not found.");
            }
        } else {
            System.out.println("User not found.");
        }
    }
}