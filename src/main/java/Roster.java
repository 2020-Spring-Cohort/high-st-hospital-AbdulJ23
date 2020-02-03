import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Roster {

    public Map<String, Employee> employeeList= new HashMap<>();

    public void hire(Employee testEmployee) {
        employeeList.put(testEmployee.getName(),testEmployee);
    }

    public ArrayList<Employee> retrieveEmployeeList() {
        return new ArrayList<>(employeeList.values());
    }


    public Employee retrieveEmployee(String employee) {
        return employeeList.get(employee);
    }





    }



