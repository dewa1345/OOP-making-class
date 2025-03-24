public class PersonDemo {
    public static void main(String[] args) {
        // Create a person using the default constructor
        Person person1 = new Person();
        // Update attributes using setter methods
        person1.setName("Hendra");
        person1.setrelationship("in a relationship");
        person1.setHobby("Pacaran");
        person1.setGender("Male");
        
        // Create a person using the parameterized constructor
        Person person2 = new Person("Dewa", "Single", "Male", "Cyberbullying");
        
        // Display information for person1
        System.out.println("Person 1 Information:");
        person1.displayInfo();
        System.out.println(person1.greet());
        System.out.println();
        
        // Display information for person2
        System.out.println("Person 2 Information:");
        person2.displayInfo();
        System.out.println(person2.greet());
    }
}