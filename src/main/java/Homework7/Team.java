package Homework7;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("No such player");
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {
        boolean removed = players.removeIf(player -> player.getName().equals(playerName));
        if (!removed){
            throw new IllegalArgumentException("Player " + playerName + " is not in the team.\n");
        }
    }

    public double getRating() {
        if (players.isEmpty()) {
            return 0;
        } else {
            return players.stream().mapToDouble(Player::overallSkill).average().orElse(0);
        }
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}
