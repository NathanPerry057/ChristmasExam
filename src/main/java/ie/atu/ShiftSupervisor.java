package ie.atu;

public class ShiftSupervisor {

    private double salary;


    public static void main(String[] args) {
        ShiftWorker sw1 = new ShiftWorker();

    }



    public ShiftSupervisor(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
