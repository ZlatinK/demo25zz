package Practice;

public class Gamer {
    private String name;
    private String guildName;
    private int age;
    private int warriorLevel;
    private int shamanLevel;
    private int paladinLevel;
    private int rangerLevel;

    public Gamer(String name, String guildName, int age, int warriorLevel, int shamanLevel, int paladinLevel, int rangerLevel) {
        setName(name);
        setGuildName(guildName);
        setAge(age);
        setWarriorLevel(warriorLevel);
        setShamanLevel(shamanLevel);
        setPaladinLevel(paladinLevel);
        setRangerLevel(rangerLevel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
        this.name = name;
    } else {
        System.out.println("No such Gamer");
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Age out of range");
        }
    }

    public String getGuildName() {
        return guildName;
    }

    public void setGuildName(String guildName) {
        if(!guildName.isEmpty()){
            this.guildName = guildName;
        }else {
            System.out.println("No such Guild");
        }
    }

    private void setWarriorLevel(int warriorLevel) {
        validateLevel(warriorLevel, "Warrior Level");
        this.warriorLevel = warriorLevel;
    }

    private void setShamanLevel(int shamanLevel) {
        validateLevel(shamanLevel, "Shaman Level");
        this.shamanLevel = shamanLevel;
    }

    private void setPaladinLevel(int paladinLevel) {
        validateLevel(paladinLevel, "Paladin Level");
        this.paladinLevel = paladinLevel;
    }

    private void setRangerLevel(int rangerLevel) {
        validateLevel(rangerLevel, "Ranger Level");
        this.rangerLevel = rangerLevel;
    }

    public void validateLevel(int level, String levelNumber) {
        if(level < 0 || level > 100) {
            System.out.println("Invalid level: " + levelNumber);
        }
    }

    public int allLevels() {
        return (warriorLevel + shamanLevel + paladinLevel + rangerLevel);
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", guildName='" + guildName + '\'' +
                ", warriorLevel=" + warriorLevel +
                ", shamanLevel=" + shamanLevel +
                ", paladinLevel=" + paladinLevel +
                ", rangerLevel=" + rangerLevel +
                '}';
    }
}

