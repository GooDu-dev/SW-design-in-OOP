public class EmployeeBuilder {

    private String name;
    private String position;
    private int salary;

    public EmployeeBuilder() {

    }

    public EmployeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder position(String position) {
        this.position = position;
        return this;
    }

    public EmployeeBuilder salary(int salary) {
        this.salary = salary;
        return this;
    }

    public Employee build() {
        return new Employee(this.name, this.position, this.salary);
    }
}