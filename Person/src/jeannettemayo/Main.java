package jeannettemayo;

public class Main {
    public static void main(String[] args) {
        // Only one object needs to be created in this case to use the class
        Person name = new Person();
        name.setFirstName("Your");
        name.setLastName("Name");
        System.out.println(name.getFullName());

    }
}
