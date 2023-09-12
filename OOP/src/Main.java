import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array for department
        String[] department = {
                "Selling",
                "Public",
                "Office"
        };

        // Call the function "Employee"
        Employee employee_1 = new Employee("Rick","Sanchez",34,"Selling");
        employee_1.search();

    }
}