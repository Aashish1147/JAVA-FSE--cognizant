import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void display() {
        System.out.println(employeeId + " " + name + " " + position + " " + salary);
    }
}

public class EmployeeManagementSystem {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    static void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count] = e;
            count++;
            System.out.println("Employee Added");
        } else {
            System.out.println("Array Full");
        }
    }

    static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Employee Found");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    static void traverseEmployees() {
        if (count == 0) {
            System.out.println("No Employees");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    static void deleteEmployee(int id) {
        int index = -1;

        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee Not Found");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee Deleted");
    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Amit", "Manager", 50000));
        addEmployee(new Employee(102, "Rahul", "Developer", 40000));
        addEmployee(new Employee(103, "Neha", "Tester", 35000));

        System.out.println("All Employees:");
        traverseEmployees();

        System.out.println();

        searchEmployee(102);

        System.out.println();

        deleteEmployee(102);

        System.out.println();

        System.out.println("Employees After Deletion:");
        traverseEmployees();
    }
}