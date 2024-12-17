public class Foot {
    public static void main(String[] args) {

    }

    public void draw(Object obj) {
        switch (obj.getClass().getName()) {
            case "Ellipse":
                Ellipse e = new Ellipse();
                e.draw();
                break;
            case "Rectangle":
                Rectangle r = new Rectangle();
                r.draw();
                break;
        }
    }
}
