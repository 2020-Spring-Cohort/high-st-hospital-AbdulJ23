import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee employee;
    private Nurse nurse;
    private Receptionist receptionist;
    private Janitor janitor;
    private Doctor doctor;

    @BeforeEach
    void setUp() {

        employee = new Employee("Ali", 100, 90000.00);
        doctor = new Doctor("Ali", 02, 90000, "Brain Surgeon");
        nurse = new Nurse("Bob", 66, 50000, 8);
        receptionist = new Receptionist("Emily", 8, 45000,true);
        janitor = new Janitor("Sam", 29, 30000,true);

    }


    @Test
    public void shouldBeAbleToAddAnEmployeeClass() {

    }

    @Test
    public void employeeShouldHaveName() {
        String result = employee.getName();
        assertEquals("Ali", result);
    }

    @Test
    public void employeeShouldHaveAnotherName() {
        employee = new Employee("Ryan", 2, 90000.00);
        String result = employee.getName();
        assertEquals("Ryan", result);
    }

    @Test
    public void employeeShouldHaveSalary() {
        double result = employee.getSalary();
        assertEquals(90000, result);
    }

    @Test
    public void employeeShouldHaveANumber() {
        int result = employee.getEmployeeNumber();
        assertEquals(100, result);

    }
    @Test
    public void employeeShouldNotBePaidUntilReceivingPay_NotPaidYet() {
        boolean result = employee.getIsPaid();
        assertFalse(result);
    }
    @Test
    public void employeeShouldNotBePaidUntilReceivingPay_HasRecievedPay() {
        employee.receivePay();
        boolean result = employee.getIsPaid();
        assertTrue(result);
    }

    @Test
    public void receptionistIsOnThePhone() {
        boolean result = receptionist.getIsOnThePhone();
        assertTrue(result);
    }

    @Test
    public void receptionistIsNotOnThePhone() {
        receptionist.noLongerOnThePhone();
        boolean result = receptionist.getIsOnThePhone();
        assertFalse(result);
    }

    @Test
    public void janitorIsSweeping() {
        boolean result = janitor.getIsSweeping();
        assertTrue(result);
    }

    @Test
    public void janitorIsNotSweeping() {
        janitor.isNoLongerSweeping();
        boolean result = janitor.getIsSweeping();
        assertFalse(result);
    }

    @Test
    public void doctorShouldHaveASpecialtyArea() {
        String result = doctor.getSpecialty();
        assertEquals("Brain Surgeon", result);
    }

    @Test
    public void doctorShouldBeAbleToDrawBlood() {
        Patient pt = new Patient("Dan",80,30);
        doctor.drawBlood(pt);
        assertEquals(77, pt.getBloodLevel());
    }

    @Test
    public void doctorShouldCareForPatient() {
        Patient pt = new Patient("Samuel",60,20);
        doctor.careForPatient(pt);
        assertEquals(30, pt.getHealthLevel());
    }

    @Test
    public void anotherDoctorShouldHaveASpecialtyArea() {
        doctor = new Doctor("Ali", 02, 90000, "Heart");
        String result = doctor.getSpecialty();
        assertEquals("Heart", result);
    }

    @Test
    public void nurseShouldHaveANumberOfPatients() {
        Nurse nurse = new Nurse("Bob", 02, 50000, 70);
        int result = nurse.getNumberOfPatients();
        assertEquals(70, result);
    }

    @Test
    public void nurseShouldHaveADifferentNumberOfPatients() {
        int result = nurse.getNumberOfPatients();
        assertEquals(8, result);
    }

    @Test
    public void nurseShouldBeAbleToDrawBlood() {
        Patient pt = new Patient("Dan",80,30);
        nurse.drawBlood(pt);
        assertEquals(75, pt.getBloodLevel());

    }

    @Test
    public void nurseShouldCareForPatient() {
        Patient pt = new Patient("Dan",80,30);
        nurse.careForPatient(pt);
        assertEquals(35, pt.getHealthLevel());

    }


}
