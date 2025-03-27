package OOP;

public class Pet {
    private String name;
    private int age;
    private Breed breed;
    private Address address;
    //Actions
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("No Name found.");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0){
        this.age = age;
        }else {
        System.out.println("No age found.");
    }
    }
    public Breed getBreed() {
        return breed;
    }
    public void setBreed(Breed breed) {
        if(!breed.equals(null)){
            this.breed = breed;
        }else{
            System.out.println("No Breed found.");
        }
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        if(!address.equals(null)){
            this.address = address;
        } else {
            System.out.println("No Address found.");
        }
    }
    public Pet(String name, int age, Breed breed, Address address) {
        setName(name);
        setAge(age);
        setBreed(breed);
        setAddress(address);
    }


    public void eats(){
        System.out.printf("%s is eating.\n", name);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Breed=" + breed +
                ", Address=" + address +
                '}';
    }
}
