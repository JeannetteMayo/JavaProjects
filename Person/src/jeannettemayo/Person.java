package jeannettemayo;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public void setFirstName(String f_name) {
        this.firstName = f_name;
    }
    public void setLastName(String l_name) {
        this.lastName = l_name;
    }
    public void setAge(int in_age) {
        if(in_age < 0 || in_age > 100) {
            this.age = 0;
        } else {
            this.age = in_age;
        }
    }
    public boolean isTeen() {
        return age > 12 && age < 20;
    }
    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if(firstName.isEmpty()) {
            return this.lastName;
        } else if(lastName.isEmpty()) {
            return this.firstName;
        } else {
            return getFirstName() + " " + getLastName();
        }
    }
}
