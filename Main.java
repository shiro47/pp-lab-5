import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 23;
        try {
            Person person = new Person("John", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        int sum = MathUtils.add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Sum is: "+sum);
    }
}