package OOP;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Parrot> parrots = new ArrayList<>();

        Breed frBulldog = new Breed("French Bulldog",
                                    "Stomach pain",
                                    "Curvy nose");
        Address mortiAddress = new Address("Kiselov", "Varna", 5252);
        Dog morti = new Dog("Morti", 5, frBulldog, mortiAddress,true);
        dogs.add(morti);

        Breed GrSheppard = new Breed("German Sheppard",
                                    "There is none",
                                    "Long nose , Long hair");
        Address BertaAddress = new Address("Georgi Traikov 202", "Shumen", 4755);
        Dog berta = new Dog("Berta", 7, GrSheppard, BertaAddress,true);
        dogs.add(berta);

        Breed Point = new Breed("German Shorthair Pointer",
                                "Leg problem",
                                "Short hair");
        Address ArchiDAddress = new Address("Patriarh Maksim 83","Varna",9002);
        Dog archiD = new Dog("Archi",3, Point, ArchiDAddress,false);
        dogs.add(archiD);

        Breed persian = new Breed("Persian",
                                    "Weak stomach",
                                    "Long hair");
        Address catAddress = new Address("Vasil Levski", "Sofia", 907);
        Cat sisi = new Cat("Sissy", 4, persian, catAddress);
        cats.add(sisi);

        Breed BrSh = new Breed("British Shorthair",
                                "Loneliness",
                                "Short hair");
        Address ArchiAddress = new Address("General Cimerman", "Varna", 9002);
        Cat archi = new Cat("Archi", 6, BrSh, ArchiAddress);
        cats.add(archi);

        Breed Scarlet = new Breed("Scarlet" ,
                                    "Falling feathers",
                                    "Long Beak");
        Address ChichiAddress = new Address("General Kiselov 13", "Varna", 9002);
        Parrot chichi = new Parrot("Chichi", 6, Scarlet, ChichiAddress, "Big", true, true);
        parrots.add(chichi);

        Breed Cockatiel = new Breed("Cockatiel",
                                    "cardiovascular disease",
                                    "Yellow Stripes");
        Address twinkyAddress = new Address("General Skobelev 24", "Plovdiv", 9008);
        Parrot twinky = new Parrot("Twinky", 4, Cockatiel, twinkyAddress, "Small",false, false);
        parrots.add(twinky);

        System.out.println("All Dogs: ");
        for (Dog d : dogs) {
            System.out.println(d);
            d.barks();
            d.train();
        }
        System.out.println("All Cats: ");
        for (Cat c : cats) {
            System.out.println(c);
            c.meows();
        }
        System.out.println("All Parrots: ");
        for (Parrot p : parrots) {
            System.out.println(p);
            p.speak();
            p.train();
        }

    }
}
