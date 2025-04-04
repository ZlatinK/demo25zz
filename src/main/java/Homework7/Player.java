package Homework7;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting){
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setEndurance(int endurance) {
        validateStat(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        validateStat(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        validateStat(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validateStat(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting){
        validateStat(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void validateStat(int stat, String statName){
        if(stat < 0 || stat > 100){
            System.out.println("Invalid stat: " + statName);
        }
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

    public double overallSkill(){
        return (endurance + sprint + dribble + passing + shooting)/ 5.0;
        }

    @Override
    public String toString() {
        return name +
                " (Skill: " +
                String.format("%.2f", overallSkill()) + ")";
    }
}
