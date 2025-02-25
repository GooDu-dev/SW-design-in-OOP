package q2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // init reporter
        ScoreReporter reporter = new ScoreReporter();

        // create Observers
        ScoreObserver display1 = new LiveScoreDisplay("display 1");
        ScoreObserver display2 = new LiveScoreDisplay("display 2");

        // attach observers
        reporter.attach(display1);
        reporter.attach(display2);

        // get score from user
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter score (or Press Enter to Quit): ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                break;
            }

            reporter.setScore(input);
        }

        sc.close();
        System.out.println("End of program");
    }
}