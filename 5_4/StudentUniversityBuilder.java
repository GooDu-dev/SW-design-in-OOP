public class StudentUniversityBuilder extends StudentBuilder {

    public StudentUniversityBuilder(Person person) {
        this.student = (Student) person;
    }

    public StudentUniversityBuilder at(String name) {
        this.student.setUniversity(name);
        return this;
    }
}
