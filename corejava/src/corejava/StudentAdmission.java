package corejava;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String fullName;
    String studentID;
    private String stream;
    private String dateOfAdmission;
    private int numberOfCourses;
    private int registrationFee;

    public Student() {
        this.fullName = "";
        this.studentID = "";
        this.stream = "";
        this.dateOfAdmission = "";
        this.numberOfCourses = 0;
        this.registrationFee = 0;
    }

    public void enterStudentDetails(String fullName, String stream, String dateOfAdmission) {
        this.fullName = fullName;
        this.stream = stream;
        this.dateOfAdmission = dateOfAdmission;

        // Generate a unique student ID
        this.studentID = generateUniqueStudentID();

        // Set registration fee based on stream
        if (stream.equals("BCIS")) {
            this.registrationFee = 35000;
        } else if (stream.equals("BBA")) {
            this.registrationFee = 30000;
        }
    }

    public void depositRegistrationFee() {
        // Code for depositing the registration fee can be added here
        System.out.println("Registration fee of Rs. " + registrationFee + " deposited.");
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public int calculateTotalFee() {
        return (numberOfCourses * 50000) + registrationFee;
    }

    public void viewStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Stream: " + stream);
        System.out.println("Number of Courses: " + numberOfCourses);
        System.out.println("Total Fee: Rs. " + calculateTotalFee());
    }

    private String generateUniqueStudentID() {
        // Generate a unique student ID based on your requirements
        // You can implement your own logic for generating a unique ID
        // For simplicity, you can use a combination of letters and numbers.
        // Example: "STU12345"
        return "STU" + (int) (Math.random() * 10000);
    }
}

public class StudentAdmission {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. New Student");
            System.out.println("2. Deposit Registration Fee");
            System.out.println("3. Calculate Total Fee");
            System.out.println("4. View Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Full Name: ");
                    scanner.nextLine();
                    String fullName = scanner.nextLine();
                    System.out.print("Enter Stream (BCIS/BBA): ");
                    String stream = scanner.next();
                    System.out.print("Enter Date of Admission: ");
                    String dateOfAdmission = scanner.next();

                    Student newStudent = new Student();
                    newStudent.enterStudentDetails(fullName, stream, dateOfAdmission);
                    students.add(newStudent);

                    System.out.println("New Student Registered. Student ID: " + newStudent.studentID);
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    String studentID = scanner.next();
                    for (Student student : students) {
                        if (student.studentID.equals(studentID)) {
                            student.depositRegistrationFee();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    studentID = scanner.next();
                    for (Student student : students) {
                        if (student.studentID.equals(studentID)) {
                            System.out.print("Enter Number of Courses: ");
                            int numberOfCourses = scanner.nextInt();
                            student.setNumberOfCourses(numberOfCourses);
                            System.out.println("Total Fee: Rs. " + student.calculateTotalFee());
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    studentID = scanner.next();
                    for (Student student : students) {
                        if (student.studentID.equals(studentID)) {
                            student.viewStudentDetails();
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
