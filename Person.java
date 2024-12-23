public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean getGender(){
        return gender;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }
    @Override
    public String toString(){
        String genderString= gender ? "Male" : "Female";
        return "Hi, I am " + name + " "+ surname +" , a " + age + "-year-old"  + genderString+ ".";
    }
    public static void main(String[] args){
        Person person = new Person("Harry","Potter","21","Male",true);
        System.out.println(person.toString());

        Person person1 = new Person("Ron","Oeslay", "34", false);
        System.out.println(person1.toString());
    }
}
