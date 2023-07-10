class Person {
    private String name;
    private int age;
    private String address;
    
    // Getter and Setter methods for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter and Setter methods for age
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Getter and Setter methods for address
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}

public class  Mt_3 {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();
        
        // Set values for properties using setter methods
        person.setName("John Doe");
        person.setAge(25);
        person.setAddress("123 Main St, City");
        
        // Display the values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
