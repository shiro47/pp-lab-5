import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30); //Nie zrozumialem czy tu ma byc 5 razy John Doe, wiec daje rozne osoby
            people[1] = new Person("Alice", 25);
            people[2] = new Person("Bob", 40);
            people[3] = new Person("Emily", 35);
            people[4] = new Person("Michael", 28);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Person person : people) {
            if (person != null) {
                int age = person.getAge();
                int value = MathUtils.add(age, b);
                String message = "The value for " + person.getName() + " is: " + value;
                EmailMessenger emailMessenger = new EmailMessenger();
                emailMessenger.sendMessage(message);
            }
        }
    }
}