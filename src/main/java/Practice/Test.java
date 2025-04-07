package Practice;

public class Test {
    public static void main(String[] args) {
        Guild guild = new Guild("Guild Elf");
        Guild guild2 = new Guild("Guild Undead");

        Gamer g1 = new Gamer("Zlatin", "Undead", 28, 74, 52, 23, 66);
        Gamer g2 = new Gamer("Savina", "Elf", 23, 27, 77, 64, 91);
        Gamer g3 = new Gamer("Jivko", "Undead", 30, 43, 53, 23, 57);
        Gamer g4 = new Gamer("Petar", "Elf", 11, 52, 83, 63, 102);

        guild.addGamer(g2);
        guild2.addGamer(g1);
        guild2.addGamer(g3);
        guild.addGamer(g4);

        System.out.println(guild);
        System.out.println(guild2);

        guild2.removeGamer("Jivko");
        System.out.println(guild2);

    }
}
