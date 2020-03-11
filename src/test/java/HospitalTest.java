import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HospitalTest {

    private Employee employee;
    private Hospital hospital;

    @BeforeEach
    void setUp() {
        employee = new Employee("Ashley",3,45000);
        hospital = new Hospital();
    }

    @Test
    public void hospitalShouldBeAbleToHireAnEmployee(){
        hospital.addEmployee(employee);
        assertTrue(hospital.getEmployees().contains(employee));
        assertTrue(hospital.getEmployeeList().containsValue(employee));
    }
    @Test
    public void hospitalShouldPrintEachEmployeeStatus(){
        String status = hospital.getEmployeeStatus(employee);
        System.out.println(status);
        assertEquals(hospital.getEmployeeStatus(employee),status);

    }
    @Test
    public void hospitalShouldPayAllEmployees(){
        hospital.addEmployee(employee);
        hospital.payAllEmployees();
        assertTrue(employee.getIsPaid());
    }
}
