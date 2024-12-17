import java.util.Scanner;

public class Foot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What to draw? 1. Ellipse, 2. Rectangle ");
        String result = scan.nextLine();

        try {
            Integer.parseInt(result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }

        int id = Integer.parseInt(result);
        draw(id);

        scan.close();
    }

    public static void draw(int id) {

        FootShape fs = new FootShape();

        switch (id) {
            case 1:
                fs.drawAsEllipse();
                break;
            case 2:
                fs.drawAsRectangle();
                break;
        }
    }
}
