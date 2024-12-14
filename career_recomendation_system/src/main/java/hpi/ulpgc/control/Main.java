package hpi.ulpgc.control;

import hpi.ulpgc.model.FreelanceListing;
import hpi.ulpgc.model.User;

public class Main {

    

    public static void main(String[] args) {
        User user1 = new User("John Doe", "johndoe@gmail.com", "123456", new String[]{}, new String[]{});
        user1.addGoal("Get a job");
        user1.addSkill("Java");
        user1.addSkill("Python");
        System.out.println(user1);

        User user2 = new User("Mary Sue", "marysue@gmail.com", "654321", new String[]{}, new String[]{});
        user2.addGoal("Work for Google");
        user2.addSkill("Ruby");
        user2.addSkill("Python");
        System.out.println(user2);

        FreelanceListing listing1 = new FreelanceListing(
        "Java Developer", 
        "Software Development", 
        "Develop Java applications", 
        1000.0, 
        "Berlin", 
        user1
        );
        System.out.println(listing1);

        FreelanceListing listing2 = new FreelanceListing(
        "Ruby Developer", 
        "Software Development", 
        "Develop Ruby applications", 
        1200.0, 
        "Prague", 
        user2
        );
        System.out.println(listing2);

    }
}