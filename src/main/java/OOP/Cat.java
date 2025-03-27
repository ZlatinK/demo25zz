package OOP;

public class Cat extends Pet {
    public Cat(String name, int age, Breed breed, Address address) {
        super(name, age, breed, address);
    }

    public void meows(){
        System.out.printf("%s is meowing.\n", getName());
    }
}
