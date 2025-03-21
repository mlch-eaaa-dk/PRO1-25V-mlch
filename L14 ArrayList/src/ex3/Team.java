package ex3;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int totalScore = 0;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("Team(%s)", name);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void printPlayers() {
        for (Player p : players) {
            String info = p.getName() + ", age " + p.getAge() + ", score " + p.getScore();
            System.out.println(info);
        }
    }

    // Pre: player.size() >= 1.
    public double calcAverageAge() {
        int ageSum = 0;
        for (Player p : players) {
            ageSum += p.getAge();
        }
        return (double) ageSum / players.size();
    }

    public int calcTotalScore() {
        int totalScore = 0;
        for (Player p : players) {
            totalScore += p.getScore();
        }
        return totalScore;
    }

    public int calcOldPlayersScore(int ageLimit) {
        int totalScore = 0;
        for (Player p : players) {
            if (p.getAge() > ageLimit)
                totalScore += p.getScore();
        }
        return totalScore;
    }

    // Pre: players.size() >= 1.
    public int maxScore() {
        int maxScore = players.get(0).getScore();
        for (Player p : players) {
            if (p.getScore() > maxScore)
                maxScore = p.getScore();
        }
        return maxScore;
    }

    public ArrayList<String> bestPlayerNames() {
        ArrayList<String> names = new ArrayList<>();
        int maxScore = this.maxScore();
        for (Player p : players) {
            if (p.getScore() == maxScore)
                names.add(p.getName());
        }
        return names;
    }
}












