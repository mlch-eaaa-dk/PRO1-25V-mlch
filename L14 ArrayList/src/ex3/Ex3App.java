package ex3;

public class Ex3App {

    public static void main(String[] args) {
        Team team = new Team("A-Team");
        System.out.println(team);

        Player jens = new Player("Jens", 26);
        team.addPlayer(jens);
        jens.setScore(40);

        Player ib = new Player("Ib", 20);
        team.addPlayer(ib);
        ib.setScore(20);

        Player hans = new Player("Hans", 27);
        team.addPlayer(hans);
        hans.setScore(30);

        Player ole = new Player("Ole", 25);
        team.addPlayer(ole);
        ole.setScore(40);

        System.out.println(team.getPlayers());
        System.out.println();

        System.out.println("Players in " + team.getName() + ":");
        team.printPlayers();
        System.out.println();

        System.out.println("Average age in " + team.getName() + ":");
        System.out.println(team.calcAverageAge() + " years");
        System.out.println();

        System.out.println("Total score in " + team.getName() + ":");
        System.out.println(team.calcTotalScore() + " goals");
        System.out.println();

        System.out.println("Old players total score in " + team.getName() + ":");
        System.out.println(team.calcOldPlayersScore(25) + " goals, Old: age > 25");
        System.out.println();

        System.out.println("Max score by a player in " + team.getName() + ":");
        System.out.println(team.maxScore() + " goals");
        System.out.println();

        System.out.println("Names of players with max score in " + team.getName() + ":");
        System.out.println(team.bestPlayerNames());
        System.out.println();
    }
}
