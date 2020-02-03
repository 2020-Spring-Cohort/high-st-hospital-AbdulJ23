public abstract class Employee {

    private String name = " ";
    public int employeeNumber;
    public int salary;

    public Employee(String name, int employeeNumber, int salary) {
        this.name= name;
        this.employeeNumber= employeeNumber;
        this. salary = salary;
    }


    public String getName() { return name;}

    public int getEmployeeNumber() { return employeeNumber; }

    public int getSalary() { return salary;}


}




