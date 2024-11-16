package eschool.entity;

public class Person {
    private String name;
    private String registration;
    private int age;

    public Person(String name, int age, String registration) {
        this.name = name;
        this.age = age;
        this.registration = registration;
    }

    public void infoPerson() {
        System.out.format("Name: %s\nAge: %d\nRegistration: %s\n", name, age, registration);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}