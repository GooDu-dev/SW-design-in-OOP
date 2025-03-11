package q2;

public class App {
    public static void main(String[] args) {
        GameContext gameContext = new GameContext();

        gameContext.setStrategy(new FootballStrategy());
        gameContext.executeGame();

        gameContext.setStrategy(new BasketballStrategy());
        gameContext.executeGame();
    }
}
