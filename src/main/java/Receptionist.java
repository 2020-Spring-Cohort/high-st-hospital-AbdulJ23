public class Receptionist extends Employee {

    private boolean isOnThePhone = true;

    public Receptionist(String name, int employeeNumber, double salary, boolean isOnThePhone) {
        super(name, employeeNumber, salary);

    }
    public boolean getIsOnThePhone() {
        return isOnThePhone;
    }

    public void noLongerOnThePhone() {
        isOnThePhone = false;
    }

    @Override
    public String toString() {
        return
                "Employee: " +
                        getName() +
                        " |salary: " + getSalary() +
                        " |employeeNumber: " + getEmployeeNumber() +
                        " | isOnThePhone:" + isOnThePhone +
                        " | Paid: " + (getIsPaid() ? "Yes " : "No");

    }
}
