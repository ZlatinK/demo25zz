package Homework7;

public class Test {
    public static void main(String[] args) {
    Team team = new Team("Team Champions");
    Team team2 = new Team("Team Dreamers");

    Player c1 = new Player("Messi", 91, 92, 96, 94, 99);
    Player c2 = new Player("Ronaldo", 95, 91, 92, 96, 95);

    team.addPlayer(c1);
    team.addPlayer(c2);

    Player d1 = new Player("Zimbabwe", 87, 92, 84, 82, 88);
    Player d2 = new Player("Zidan", 81, 82, 78, 88, 79);
    Player d3 = new Player("Porthos", 72, 71, 64, 66, 59);

    team2.addPlayer(d1);
    team2.addPlayer(d2);
    team2.addPlayer(d3);

    System.out.println(team);
    System.out.println(team2);

    System.out.println("Rating before removal: " + team2.getRating());

    team2.removePlayer("Porthos");

    System.out.println("Rating after removal: " + team2.getRating());

    System.out.println(team2);
    
    team.removePlayer("Zidan");
    }

}

