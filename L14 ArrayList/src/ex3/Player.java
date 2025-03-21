package ex3;

public class Player {
    private String name;
    private int age;
    private int score;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
        score = 0;
    }

    public String toString() {
        return String.format("Player(%s, age=%d, score=%d)", name, age, score);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
