import java.util.ArrayList;
import java.util.List;
public class School {
    private List<Person> members;
    public School() {
        this.members = new ArrayList<>();
    }
    public void addMember(Person person) {
        members.add(person);
    }
    public List<Person> getMembers() {
        return members;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School members:\n");
        for (Person person : members) {
            result.append(person.toString()).append("\n");
        }
        return result.toString();
    }
}
