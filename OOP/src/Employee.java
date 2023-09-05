import java.util.Objects;
import java.util.Scanner;

public class Employee {
    // Variable set
    String name;
    int age;
    String department;

    // Create scanner for input
    Scanner scanner = new Scanner(System.in);

    // Principal Function
    Employee(String name,int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void search() {
        System.out.println("What name you are searching: ");
        String searchedName = scanner.nextLine();

        if (Objects.equals(searchedName, this.name)){
            System.out.println("Results: " + this.name);
        }
    }

}
