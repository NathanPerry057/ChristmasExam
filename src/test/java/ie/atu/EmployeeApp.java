package ie.atu;

public class EmployeeApp {


    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("EMPLOYEE 1");
        System.out.println("Name: " + e1.getName());
        System.out.println("ID: " + e1.getId());

        ShiftWorker sw = new ShiftWorker();
        System.out.println("Shift start time: " + sw.getShift());
        System.out.println("PPS: " + sw.getPayroll());
        System.out.println("Pay Rate: " + sw.getPayRate());
    }

}
