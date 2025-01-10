public class Student extends Person {

    private String university = null;
    private int age = -1;

    public Student(String name, String university) {
        super(name);

        this.university = university;

    }

    public Student(String name, String university, int age) {
        super(name);

        this.university = university;
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}