package q1;

public class App {
    public static void main(String[] args) {
        Game football = new FootballGame();
        football.play();

        Game basketball = new BasketballGame();
        basketball.play();
    }
}
