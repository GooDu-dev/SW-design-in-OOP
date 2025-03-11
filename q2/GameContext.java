package q2;

class GameContext {
    private GameStrategy strategy;

    public void setStrategy(GameStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeGame() {
        strategy.initializeStrategy();
        strategy.playStrategy();
        strategy.showResult();
    }
}
