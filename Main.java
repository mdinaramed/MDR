import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> members = new ArrayList<>();

        File studentFile = new File("/Users/dinaramedeubek/Downloads/students.txt");
        Scanner studentScanner = new Scanner(studentFile);

        while (studentScanner.hasNextLine()) {
            String name = studentScanner.next();
            String surname = studentScanner.next();
            int age = Integer.parseInt(studentScanner.next());
            boolean gender = Boolean.parseBoolean(studentScanner.next());

            Student student = new Student(name, surname, age, gender);

            while (studentScanner.hasNextInt()) {
                student.addGrade(studentScanner.nextInt());
            }

            members.add(student);

            if (studentScanner.hasNextLine()) {
                studentScanner.nextLine();
            }
        }
        studentScanner.close();

        File teacherFile = new File("/Users/dinaramedeubek/Downloads/teachers.txt");
        Scanner teacherScanner = new Scanner(teacherFile);

        while (teacherScanner.hasNextLine()) {
            String name = teacherScanner.next();
            String surname = teacherScanner.next();
            int age = Integer.parseInt(teacherScanner.next());
            boolean gender = Boolean.parseBoolean(teacherScanner.next());
            String subject = teacherScanner.next();
            int yearsOfExperience = Integer.parseInt(teacherScanner.next());
            int salary = Integer.parseInt(teacherScanner.next());

            Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);

            members.add(teacher);

            if (teacherScanner.hasNextLine()) {
                teacherScanner.nextLine();
            }
        }
        teacherScanner.close();

        for (Person member : members) {
            if (member instanceof Student) {
                Student student = (Student) member;
                System.out.println(student + " GPA: " + student.calculateGPA());
            } else if (member instanceof Teacher) {
                Teacher teacher = (Teacher) member;
                if (teacher.getYearsOfExperience() > 10) {
                    teacher.giveRaise(10);
                }
                System.out.println(teacher + " New Salary: " + teacher.getSalary());
            }
        }
    }
}