import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) {
        EmployeeBuilder builder = new EmployeeBuilder();
        Employee ceo = builder.name("Settha").position("CEO").salary(500000).build();
        Employee head_sales = builder.name("Kamphaka").position("Head Sales").salary(300000).build();
        Employee sale_1 = builder.name("Wiroj").position("Sales").salary(100000).build();
        Employee sale_2 = builder.name("Weeranan").position("Sales").salary(100000).build();
        Employee head_market = builder.name("Ungink").position("Head Marketing").salary(300000).build();
        Employee market_1 = builder.name("Oak").position("Marketing").salary(200000).build();
        Employee market_2 = builder.name("Aem").position("Marketing").salary(250000).build();

        Relations.add(ceo, head_sales);
        Relations.add(ceo, head_market);
        Relations.add(head_sales, sale_1);
        Relations.add(head_sales, sale_2);
        Relations.add(head_market, market_1);
        Relations.add(head_market, market_2);

        printAllEmployee(ceo, Relations.getRealtions(), 0);
    }

    public static void printAllEmployee(Employee manager, Map<Employee, List<Employee>> relationships, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println(manager);

        List<Employee> downLines = relationships.get(manager);

        if (downLines == null || downLines.size() == 0) {
            return;
        }

        for (Employee downLine : downLines) {
            printAllEmployee(downLine, relationships, depth + 1);
        }
    }
}
