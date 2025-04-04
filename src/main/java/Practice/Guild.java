package Practice;
import java.util.ArrayList;
import java.util.List;

public class Guild {
    private String name;
    private List<Gamer> gamers;

    public Guild(String name) {
        setName(name);
        this.gamers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public List<Gamer> getGamers() {
        return gamers;
    }

    public void setGamers(List<Gamer> gamers) {
        this.gamers = gamers;
    }

    public void addGamer(Gamer gamer) {
        gamers.add(gamer);
    }

    public void removeGamer(String gamerName) {
        boolean removed = gamers.removeIf(gamer -> gamer.getName().equals(gamerName));
        if(!removed) {
            throw new IllegalArgumentException("Gamer " + gamerName + " not found\n");
        }
    }

    public double getLevel() {
        if(gamers.isEmpty()) {
            return 0;
        }else {
            return gamers.stream().mapToInt(Gamer::allLevels).average().orElse(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Guild{name='").append(name).append("', gamers=[");

        for (int i = 0; i < gamers.size(); i++) {
            builder.append("\n").append(gamers.get(i));
            if (i < gamers.size() - 1) {
                builder.append(",");
            }
        }
        builder.append("\n");
        return builder.toString();
    }
}
