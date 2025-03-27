package OOP;

public class Breed {
    private String name;
    private String possibleIllness;
    private String breedCharacteristics;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        } else {
            System.out.println("Error: Invalid Name");
        }
    }

    public String getPossibleIllness() {
        return possibleIllness;
    }

    public void setPossibleIllness(String possibleIllness) {
        if (!possibleIllness.isEmpty()){
            this.possibleIllness = possibleIllness;
        } else {
            System.out.println("Error: Invalid Entry");
        }
    }

    public String getBreedCharacteristics() {
        return breedCharacteristics;
    }

    public void setBreedCharacteristics(String breedCharacteristics) {
        if (!breedCharacteristics.isEmpty()){
            this.breedCharacteristics = breedCharacteristics;
        } else {
            System.out.println("Error: Invalid Entry");
        }
    }
    //constructor
    public Breed(String name, String possibleIllness, String breedCharacteristics) {
        setName(name);
        setPossibleIllness(possibleIllness);
        setBreedCharacteristics(breedCharacteristics);
    }
    @Override
    public String toString()
    {
        return name + ", Health: " + possibleIllness + ", Features: " + breedCharacteristics;
    }
}
