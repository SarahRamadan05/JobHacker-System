import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "123-456-7890", "john@example.com");
        Student student = new Student("Jane Smith", "456 Elm St", "987-654-3210", "jane@example.com", Student.SOPHOMORE);
        Employee employee = new Employee("Alice Johnson", "789 Oak St", "555-123-4567", "alice@example.com", "A123", 50000, new Date());
        Faculty faculty = new Faculty("Bob Williams", "321 Pine St", "111-222-3333", "bob@example.com", "B456", 70000, new Date(), "9 AM - 5 PM", "Professor");
        Staff staff = new Staff("Sarah Davis", "789 Walnut St", "444-555-6666", "sarah@example.com", "C789", 40000, new Date(), "Assistant");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
