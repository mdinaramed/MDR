import java.util.ArrayList;
import java.util.List;
public class Main{

    public static void main(String[] args) throws Exception {
        School school = new School();
        Student student1=new Student("Harry", "Potter",21,true);
        student1.addGrade(78);
        student1.addGrade(89);
        student1.addGrade(99);
        student1.addGrade(51);
        school.addMember(student1);

        Student student2=new Student("Ron", "Oeslay",20,true);
        student2.addGrade(78);
        student2.addGrade(89);
        student2.addGrade(75);
        student2.addGrade(63);
        student2.addGrade(82);
        school.addMember(student2);

        Teacher teacher1 =new Teacher("Severus", "Snape",51,true,"math",7,800000);
        teacher1.giveRaise(10);
        school.addMember(teacher1);

        Teacher teacher2 = new Teacher("Albus", "Dumbledore",71,true,"philosophy",25,1500000);
        school.addMember(teacher2);
        System.out.println(school);
        for (Person member : school.getMembers()) {
            if (member instanceof Student) {
                Student student = (Student) member;
                System.out.println(student.toString() + " GPA: " + student.calculateGPA());
            }
        }

    }
}