public class Janitor extends Employee {

    private boolean isSweeping = true;


    public Janitor(String name, int employeeNumber, double salary, boolean isSweeping) {
        super(name, employeeNumber, salary);

    }
    public boolean getIsSweeping() {
        return isSweeping;
    }

    public void isNoLongerSweeping() {
        isSweeping = false;
    }
    @Override
    public String toString() {
        return "Employee: " +
                getName() +
                " |salary: " + getSalary() +
                " | employeeNumber: " + getEmployeeNumber() +
                " | Sweeping: " + isSweeping  +
                " | Paid: " + (getIsPaid() ? "Yes " : "No");
    }

}
