package q2;

public class LiveScoreDisplay implements ScoreObserver {
    private String observerName;

    public LiveScoreDisplay(String observerName) {
        this.observerName = observerName;
    }

    public void updateScore(String score) {
        System.out.println("live result: " + score + " <- display " + observerName);
    }
}