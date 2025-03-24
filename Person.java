
public class Person {
    // Instance variables (attributes)
    private String name;
    private String relationship;
    private String gender;
    private String hobby;
    
    // Default constructor
    public Person() {
        // Initialize with default values
        this.name = "Unknown";
        this.relationship = "Unspecified";
        this.gender = "Unspecified";
        this.hobby = "Unspecified";
    }
    
    // Parameterized constructor
    public Person(String name, String relationship,String gender,String hobby) {
        this.name = name;
        this.relationship = relationship;
        this.gender = gender;
        this.hobby = hobby;
    }
    
    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getrelationship() {
        return relationship;
    }
    
    public void setrelationship(String relationship) {
        this.relationship = relationship;
    }

    // Setter and Getter for 'hobby'

    public String gethobby() {
        return hobby;
    }

    public void setHobby(String hobby ) {
        this.hobby = hobby;
    }


    
    // Getter and Setter for 'gender'
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Relationship: " + relationship);
        System.out.println("Gender: " + gender);
        System.out.println("Hobby: " + hobby);
    }
    
    // Method to provide a greeting
    public String greet() {
        return "Hello, my name is " + name + "!";
    }
}