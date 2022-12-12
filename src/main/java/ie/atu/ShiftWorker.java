package ie.atu;

import java.util.Random;
import java.util.Scanner;

public class ShiftWorker {

    private int shift;
    private int payroll;
    private double payRate = 11.25;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("You'll start your shift at: ");
        Random r = new Random();
        for (int shift = 0; shift < 1; shift++) {
            System.out.println(r.nextInt(2) + 1);

        }
        System.out.println("Please enter your PPS: ");
        int payroll = s.nextInt();
        ShiftWorker sw = new ShiftWorker();
        sw.setPayroll(payroll);
        System.out.println("PSS: " + sw.getPayroll());

        System.out.println("Your hourly pay rate is: " + sw.getPayRate());



    }









    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getPayroll() {
        return payroll;
    }

    public void setPayroll(int payroll) {
        this.payroll = payroll;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
}
