import java.util.Scanner;

public class HospitalApplication {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Ali", 1, 90000);
        Nurse nurse = new Nurse("Bob", 2, 50000);
        Receptionist receptionist = new Receptionist("Ashley", 3, 45000);
        Janitor janitor = new Janitor("Ryan", 4, 40000);
        Roster payroll = new Roster();
        payroll.hire(doctor);
        payroll.hire(janitor);
        payroll.hire(receptionist);
        payroll.hire(nurse);

        System.out.println("Welcome to high street hospital,Here are our employees");
        System.out.println(payroll.retrieveEmployeeList());

        for (Employee employee : payroll.retrieveEmployeeList()) {
            System.out.println(employee);


        }

    }

}