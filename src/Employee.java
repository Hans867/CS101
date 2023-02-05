public class Employee {

    private String firstName;

    private String lastName;

    private int monthlySalary;

    public Employee (String firstName, String lastName, int monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;

        }

    public double setMonthlySalary () {
        if (getMonthlySalary() < 0) {

        } return 0.0;
    }

    public void yearlySalary () {

        int employeeYearlySalary = getMonthlySalary() * 12;
        System.out.println(this.getFirstName() + " " + this.getLastName()+ "'s " + "yearly salary is: " + employeeYearlySalary);
    }

    public void yearlySalaryWithRaise () {
        int moneyMovesOnLan = (int) (getMonthlySalary() * 1.1 * 12);
        System.out.println(this.getFirstName() + " " + this.getLastName()+ "'s " + "yearly salary after 10 % raise: " + moneyMovesOnLan);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getMonthlySalary() {
        return this.monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }

}
