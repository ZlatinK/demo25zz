package OOP;

public class Dog extends Pet {
    private boolean isTrained;
    public Dog(String name, int age, Breed breed, Address address, boolean isTrained) {
        super(name, age, breed, address);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public void barks(){
        System.out.printf("%s is barking.\n", getName());
    }

    public void train() {
        if (isTrained) {
            System.out.printf("%s is trained!\n", getName());
        } else {
            System.out.printf("%s is not trained!\n", getName());
        }
    }
}
