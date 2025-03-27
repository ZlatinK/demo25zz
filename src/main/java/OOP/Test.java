package OOP;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        Breed frBulldog = new Breed("French Bulldog",
                                    "Stomach pain",
                                    "Curvy nose");
        Address mortiAddress = new Address("Kiselov", "Varna", 5252);
        Dog morti = new Dog("Morti", 5, frBulldog, mortiAddress);
        dogs.add(morti);

        System.out.println(morti);

        Breed GrSheppard = new Breed("German Sheppard",
                                    "There is none",
                                    "Long nose , Long hair");
        Address BertaAddress = new Address("Georgi Traikov 202", "Shumen", 4755);
        Dog berta = new Dog("Berta", 7, GrSheppard, BertaAddress);
        dogs.add(berta);

        System.out.println(berta);

        Breed Point = new Breed("German Shorthair Pointer",
                                "Leg problem",
                                "Short hair");
        Address ArchiDAddress = new Address("Patriarh Maksim 83","Varna",9002);
        Dog archiD = new Dog("Archi",3, Point, ArchiDAddress);
        dogs.add(archiD);

        System.out.println(archiD);

        Address catAddress = new Address("Vasil Levski", "Sofia", 907);
        Breed persian = new Breed("Persian",
                                    "Weak stomach",
                                    "Long hair");
        Cat sisi = new Cat("Sissy", 4, persian, catAddress);
        cats.add(sisi);

        System.out.println(sisi);

        Address ArchiAddress = new Address("General Cimerman", "Varna", 9002);
        Breed BrSh = new Breed("British Shorthair",
                                "Loneliness",
                                "Short hair");
        Cat archi = new Cat("Archi", 6, BrSh, ArchiAddress);
        cats.add(archi);

        System.out.println("All Dogs: ");
        for (Dog d : dogs) {
            System.out.println(d);
            d.barks();
        }
        System.out.println("All Cats: ");
        for (Cat c : cats) {
            System.out.println(c);
            c.meows();
        }
    }
}
