package jeannettemayo;

public class Main {
    public static void main(String[] args) {
        // Only one object needs to be created to use the Person() class.
        Person name = new Person();
        /* Call setFirstName() and setLastName() methods from the 'name' object
        that was created */
        name.setFirstName("Your");
        name.setLastName("Name");
        // Print full name
        System.out.println(name.getFullName());

    }
}
