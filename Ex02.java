
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Ex02 {
    public static final int MAX = 5;
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (nums.size() < MAX) {

            String s = GetUserInput();

            try {
                Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid! Try again!");
                continue;
            }
            int num = Integer.parseInt(s);

            if (!IsValidRange(num, 0, 10)) {
                System.out.println("Invalid range! Try again!");
                continue;
            }
            nums.add(num);
        }

        nums = Sort(nums);

        System.out.println("== Sorted Data ==");
        PrintObject(nums);

        scan.close();
    }

    public static String GetUserInput() {
        String user_input = scan.nextLine();
        return user_input;
    }

    public static Boolean IsValidDataType(Object data, Object checker) {
        return data.equals(checker);
    }

    public static Boolean IsValidRange(int num, int min, int max) {
        return (num >= min) || (num <= max);
    }

    public static <T> List<T> Sort(Collection<T> list) {
        return list.stream().sorted().toList();
    }

    public static <T> void PrintObject(Collection<T> list) {
        list.stream().forEach(System.out::println);
        return;
    }
}