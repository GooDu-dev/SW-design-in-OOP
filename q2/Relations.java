import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Relations {
    private static Map<Employee, List<Employee>> relationships = new HashMap<Employee, List<Employee>>();

    public static void add(Employee manager, Employee employee) {

        List<Employee> definedEmployee = relationships.get(manager);

        if (definedEmployee == null) {
            List<Employee> emp_lists = new ArrayList<Employee>();
            emp_lists.add(employee);

            relationships.put(manager, emp_lists);
        } else {
            definedEmployee.add(employee);
            relationships.replace(manager, definedEmployee);
        }

    }

    public static Map<Employee, List<Employee>> getRealtions() {
        return Relations.relationships;
    }

}
