import java.util.ArrayList;
import java.util.List;
public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public static List<Teacher>readTeachersFromFile(String fileName) {
        List<Teacher> teachers = new ArrayList<>();
        return teachers;
    }
    public Teacher(String name,String surname, int age,boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary=salary;
}
    public void giveRaise(double percentage){
        if(percentage >= 0){
            salary+=salary*percentage/100;
        } else {
            System.out.println("Raise percentage must be a positive number");
        }
    }
    @Override
    public String toString() {
        return super.toString() + "I teach " +subject+ ".";
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
