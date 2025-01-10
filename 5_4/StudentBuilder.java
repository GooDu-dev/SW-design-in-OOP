public class StudentBuilder {

    protected Student student;

    public StudentBuilder() {

    }

    public StudentBuilder(Person person) {
        this.student = (Student) person;
    }

    public StudentUniversityBuilder university() {
        return new StudentUniversityBuilder(this.student);
    }

    public StudentBuilder age(int age) {
        this.student.setAge(age);
        return this;
    }

    public Student build() {
        return this.student;
    }

}
