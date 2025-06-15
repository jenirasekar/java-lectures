import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GradeManagementSystem {

    private ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        GradeManagementSystem gms = new GradeManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            gms.printMenu();
            int menuSelected = sc.nextInt();
            if (menuSelected == 1) {
                System.out.println("Please input student ID: ");
                int studentId = sc.nextInt();
                System.out.println("Please input student name: ");
                String name = sc.next();
                System.out.println("Please input a score of Chinese: ");
                double chinese = sc.nextDouble();
                System.out.println("Please input a score of English: ");
                double english = sc.nextDouble();
                System.out.println("Please input a score of Math: ");
                double math = sc.nextDouble();
                gms.addStudent(studentId, name, chinese, english, math);
            } else if (menuSelected == 2) {
                System.out.println("Please input the name: ");
                String name = sc.next();
                System.out.println("Please input score of chinese: ");
                double chinese = sc.nextDouble();
                System.out.println("Please input score of english: ");
                double english = sc.nextDouble();
                System.out.println("Please input score of math: ");
                double math = sc.nextDouble();
                gms.editGrade(name, chinese, english, math);
            } else if (menuSelected == 3) {
                System.out.println("Please input the name");
                String name = sc.next();
                gms.searchStudent(name);
            } else if (menuSelected == 4) {
                System.out.println("======= All Student =======");
                gms.displayAllStudents();
            } else if (menuSelected == 5) {
                System.out.println("======= All Student  after rank =======");
                gms.generateRanking();
            } else if (menuSelected == 0) {
                break;
            }
        }
    }
    private void printMenu() {
        System.out.println("Welcome to Grade Management System");
        System.out.println("1. Add new student");
        System.out.println("2. Edit a student's grade");
        System.out.println("3. Search a student");
        System.out.println("4. Display all student");
        System.out.println("5. Generate ranking");
        System.out.println("0. Exit");
        System.out.println();
    }

    public void addStudent(int id, String name, double chinese, double english, double math) {
        Student student = new Student(id, name, chinese, english, math);
        students.add(student);
    }

    public void editGrade(String name, double chinese, double english, double math) {
        Student studentSelected = null;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                studentSelected = student;
            }
        }
        if (studentSelected != null) {
            studentSelected.setChinese(chinese);
            studentSelected.setEnglish(english);
            studentSelected.setMath(math);
        } else {
            System.out.println("Cannot find " + name);
        }
    }

    public void searchStudent(String name) {
        Student studentSelcted = null;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                studentSelcted = student;
            }
        }
        if (studentSelcted != null) {
            studentSelcted.displayInfo();
        } else {
            System.out.println("Cannot find " + name);
        }
    }

    public void generateRanking() {
        ArrayList<Student> studentsForSorting = new ArrayList(students);
        Collections.sort(studentsForSorting, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.totalScore() == o2.totalScore()) {
                    return 0;
                }
                return o1.totalScore() < o2.totalScore() ? 1 : -1;
            }
        });
        for (Student student : studentsForSorting) {
            student.displayInfo();
        }
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
