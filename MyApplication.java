import java.util.ArrayList;
import java.util.Collections;

public class MyApplication{
    public static void main(String[] args) {
        Employee employee1 = new Employee("John","Lennon","Teacher",27045.78);
        Employee employee2 = new Employee("George","Harrison","Developer",50000.00 );
        Student student1 = new Student("Ringo","Starr",2.4);
        Student student2 = new Student("Paul","McCartney",3.2);

        ArrayList<Payable>payables = new ArrayList<>();
        payables.add(employee1);
        payables.add(employee2);
        payables.add(student1);
        payables.add(student2);

        Collections.sort(payables, (p1, p2) -> Double.compare(p1.getPaymentAmount(), p2.getPaymentAmount()));
        printData(payables);
    }
    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable.toString()+ " earns " + payable.getPaymentAmount() + " tenge");
        }
    }

}