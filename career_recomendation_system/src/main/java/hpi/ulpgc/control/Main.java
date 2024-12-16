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
        // Más opciones pueden ser añadidas aquí

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea restante

        switch (choice) {
            case 1:
                System.out.println("Enter User Name:");
                String name = scanner.nextLine();
                User user = system.users.stream().filter(u -> u.name.equals(name)).findFirst().orElse(null);
                if (user != null) {
                    System.out.println("Enter Course Title:");
                    String title = scanner.nextLine();
                    Course course = system.courses.stream().filter(c -> c.getTitle().equals(title)).findFirst().orElse(null);
                    if (course != null) {
                        user.addCourse(course);
                        System.out.println("Course added successfully!");
                    } else {
                        System.out.println("Course not found.");
                    }
                } else {
                    System.out.println("User not found.");
                }
                break;
            case 2:
                // Implementar la opción de remover cursos similar a la opción de añadir
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

        scanner.close();
    }
}