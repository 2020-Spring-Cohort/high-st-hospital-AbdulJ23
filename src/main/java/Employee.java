public class Employee {

    private String name;
    private double salary;
    private int employeeNumber;
    private boolean isPaid= false;

    public Employee(String name, int employeeNumber, double salary) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public void receivePay() { isPaid = true;}

}


