public class Nurse extends Employee implements AbleToDrawBloodAndCareForPatient {
    private int numberOfPatients;

    public Nurse(String name, int employeeNumber, double salary, int numberOfPatients) {
        super(name, employeeNumber, salary);

        this.numberOfPatients = numberOfPatients;

    }
    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    @Override
    public void drawBlood(Patient pt) {
        pt.drawBlood(5);

    }

    @Override
    public void careForPatient(Patient pt) {
        pt.careForPatient(5);

    }
    @Override
    public String toString() {
        return "Employee: " +
                getName() +
                " | salary: " + getSalary() +
                " | employeeNumber: " + getEmployeeNumber() +
                " | numberOfPatients: " + numberOfPatients +
                " | Paid: " + (getIsPaid() ? "Yes " : "No");
    }
}