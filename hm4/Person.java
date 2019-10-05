package Homeworks.hm4;

//
public class Person {

    private String name;
    private int age;


    public Person() {
        name = "No name";
        age = -1;
    }

    public Person(String name) {
        this.name = name;
        age = -1;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public String getGreeting() {
        if (age == -1 && name.length() == 0) {
            return "I am John Doe";
        }
        if (age == -1) {
            return String.format("Hello, I am %s.", name);
        }
        return String.format("Hello, I am %s. I am %d years old.", name, age);

    }

    public static void main(String[] args) {
        Person person = new Person("Yavor", 23);

        System.out.println(person.getGreeting());
        Person person1 = new Person("Yavor");
        System.out.println(person1.getGreeting());
    }
}
