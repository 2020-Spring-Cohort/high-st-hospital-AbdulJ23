
public class Doctor extends Employee implements AbleToDrawBloodAndCareForPatient {

    private String specialty;


    public Doctor(String name, int employeeNumber, double salary, String specialty) {
        super(name, employeeNumber, salary);

        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void drawBlood(Patient pt) {
        pt.drawBlood(3);

    }
    @Override
    public void careForPatient(Patient pt) {

        pt.careForPatient(10);
    }
    @Override
    public String toString() {
        return "Employee: " +
                getName() +
                " |  salary: " + getSalary() +
                " | employeeNumber:  " + getEmployeeNumber()  +
                " | Specialty: " + getSpecialty() +
                " | Paid: " + (getIsPaid() ? "Yes " : "No");


    }
}
