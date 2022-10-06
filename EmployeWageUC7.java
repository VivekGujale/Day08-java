//Refactor the Code to write a Class Method to Compute Employee Wage - Use Class Method and Class

public class EmployeWageUC7 {

    public static int EmpWage() {
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHr = 20;
        int empHrs;
        double empCheck = Math.floor(Math.random() * 10 % 3);
        if (empCheck == isPartTime) {
            empHrs = 8;
        } else if (empCheck == isFullTime) {
            empHrs = 16;
        } else {
            empHrs = 0;
        }
        return empRatePerHr * empHrs;
    }

    public static void main(String[] args) {

        System.out.println("Employee Wage =" + EmployeWageUC7.EmpWage());
    }
}
