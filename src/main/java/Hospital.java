import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hospital {

    private HashMap<String, Patient> patientList = new HashMap<String, Patient>();
    private HashMap<String, Employee> employeeList = new HashMap<String, Employee>();

    public void addEmployee(Employee employee) {
        employeeList.put(employee.getName(), employee);
    }
    public void addPatientList(Patient patient){
        patientList.put(patient.getName(), patient);
    }

    public HashMap<String,Patient> getPatientList(){
        return patientList;
    }

    public HashMap<String, Employee> getEmployeeList() {

        return employeeList;
    }

    public Collection<Employee> getEmployees() {

        return employeeList.values();
    }

    public String getEmployeeStatus(Employee employee) {
        return employee.toString();
    }

    public void payAllEmployees() {
        for (Employee employeeToBePaid : employeeList.values()) {
            employeeToBePaid.receivePay();
        }
    }
}