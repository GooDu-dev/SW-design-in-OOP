package q1;

abstract class Game {
    abstract void initializeGame();

    abstract void playingGame();

    abstract void showResult();

    public final void play() {
        initializeGame();
        playingGame();
        showResult();
    }
}