public class Student extends Person {
    private double GPA;


    public Student(String name, String surname, double GPA) {
        super(name,surname);
        this.GPA = GPA;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
    @Override
    public double getPaymentAmount(){
        return GPA>2.67 ? 36660.00 : 0;
    }
}