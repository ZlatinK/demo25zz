package OOP;

public class Dog extends Pet {

    public Dog(String name, int age, Breed breed, Address address) {
        super(name, age, breed, address);
    }

    public void barks(){
        System.out.printf("%s is barking.\n", getName());
    }

}
