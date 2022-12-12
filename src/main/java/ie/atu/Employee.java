package ie.atu;

import java.util.Scanner;

public class Employee {

    private String name;
    private String id;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Employee name ");
        String name = s.nextLine();
        Employee e1 = new Employee();
        e1.setName(name);

        System.out.println("Enter the employee id ");
        String id = s.nextLine();
        e1.setId(id);

        System.out.println("Employee 1");
        System.out.println("Name: " + e1.getName());
        System.out.println("ID: " + e1.getId());
    }


    public void getReportDetails() {
        System.out.println("Employee 1: " + getName());
        getName();
        getId();
    }


    public Employee() {
        String name = "";
        String id = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
