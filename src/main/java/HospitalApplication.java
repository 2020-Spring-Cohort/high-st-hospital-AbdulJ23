import java.util.Scanner;


public class HospitalApplication {
    private static String answer = "";
    private static Doctor Ali = new Doctor("Dr.Ali", 1, 90000, "Brain Surgeon ");
    private static Nurse Bob = new Nurse("Nurse Bob", 2, 50000, 3);
    private static Receptionist Ashley = new Receptionist("Receptionist Ashley", 3, 45000, false);
    private static Janitor Sam = new Janitor("Janitor Sam", 3, 40000, false);
    private static Patient Dan = new Patient("Dan", 80, 30);
    private static Patient Samuel = new Patient("Samuel", 60, 20);

    public static void main(String[] args) {

        printWelcomeStatement();

        printEmployeeStatus();

        System.out.println("Choose which employee you would like to use");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        caseStatementGame(scanner, userChoice);
    }


    private static void caseStatementGame(Scanner scanner, String userChoice) {
        int count = 0;
        while (count < 1) {

            switch (userChoice.toLowerCase()) {
                case "doctor":
                case "nurse":
                    System.out.println("Please choose the patient you want to tend to today.");
                    System.out.println("\n");
                    printPatientList();
                    answer = scanner.nextLine();
                        Ali.drawBlood(Dan);
                    Ali.careForPatient(Dan);
                    if (answer.toLowerCase().equals("dan")) {
                        System.out.println("You have treated the patient and he is back to good health.");
                        System.out.println("Blood level is now at " + Dan.getBloodLevel());
                        System.out.println("Health level is now at " + Dan.getHealthLevel());
                        System.out.println("\n");
                        printEmployeePaidStatus();
                        printClosingRemarks();
                        break;
                    } else if(answer.toLowerCase().equals("andre")){
                        System.out.println("You have treated the patient and he is back to good health");
                        System.out.println("Blood level is now at " + Samuel.getBloodLevel());
                        System.out.println("Health level is now at " + Samuel.getHealthLevel());
                        System.out.println("\n");
                        printEmployeePaidStatus();
                        printClosingRemarks();

                    } else {
                        System.out.println("You just kiled your patient. Good luck in jail!");
                        System.exit(0);
                    }
                    break;

                case "receptionist":
                    System.out.println("Answer the phone? Yes or No");
                    answer = scanner.nextLine();
                    if (answer.toLowerCase().equals("yes")) {
                        // System.out.println("Please help the customer!");
                        Receptionist sally = new Receptionist("Ashley", 3, 45000, true);
                        System.out.println("Yo just got a paycheck!");
                        sally.receivePay();
                        System.out.println(sally);
                        System.out.println("\n");
                        printPatientStatus();
                        printClosingRemarks();
                    } else {
                        System.out.println("You have been terminated!");
                    }
                    System.exit(0);
                    break;
                case "janitor":
                    System.out.println("Sweep or sleep?");
                    answer = scanner.nextLine();


                    if (answer.toLowerCase().equals("sweep")) {
                        System.out.println("Sweep");
                        System.out.println("You have been paid for doing your job!");
                        Janitor Sam = new Janitor("Sam", 132, 40000, true);
                        Sam.receivePay();
                        System.out.println(Sam);
                        System.out.println("\n");
                        printPatientStatus();
                        printClosingRemarks();

                    } else {
                        System.out.println("You have been terminated!");
                    }
                    System.exit(0);
                    userChoice = scanner.nextLine();
                    break;
                default:
                    System.out.println("You've been terminated or just created the new facebook and is now rich!");
            }
            count++;
        }
    }

    private static void printPatientList() {
        Patient Dan = new Patient("Dan", 80, 30);
        Patient andre = new Patient("Samuel", 60, 20);
        System.out.println(Dan);
        System.out.println(Samuel);

    }
    private static void printPatientStatus() {
        System.out.println("In a different department the patients have already been looked after by the nurse and doctor.");
        Ali.careForPatient(Dan);
        Bob.careForPatient(Samuel);
        System.out.println("Dan's health level is currently at " + Dan.getHealthLevel() + ". ");
        System.out.println("The patient Samuel's' health level is now at " + Samuel.getHealthLevel() + ".");
        System.out.println("\n");
    }

    private static void printWelcomeStatement() {
        System.out.println("Welcome to High Street Hospital " + "\n"
                + "Here is a list of all of our employees!");

        System.out.println("\n");
    }

    private static void printEmployeeStatus() {
        System.out.println(Ali);
        System.out.println(Bob);
        Ashley.getIsOnThePhone();
        System.out.println(Ashley);
        Sam.getIsSweeping();
        System.out.println(Sam);
        System.out.println("\n");


    }
    private static void printEmployeePaidStatus() {
        Ali.receivePay();
        System.out.println(Ali);
        Bob.receivePay();
        System.out.println(Bob);
        Ashley.receivePay();
        Ashley.noLongerOnThePhone();
        System.out.println(Ashley);
        Sam.isNoLongerSweeping();
        Sam.receivePay();
        System.out.println(Sam);
        System.out.println("\n");
    }

    private static void printClosingRemarks() {
        System.out.println("Thank you visiting High Street Hospital We Thank you for coming! \n" +
                "If youre ever not feeling good please dont be shy to pay us a visit \n" +
                "We try our best to take care all of our patients! ");
    }
}
