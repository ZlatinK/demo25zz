package OOP;

public class Parrot extends Pet {
    private String vocabularyLevel;
    private boolean canMimic;
    private boolean isTrained;

    public Parrot(String name, int age, Breed breed, Address address, String vocabularyLevel, boolean canMimic, boolean isTrained) {
        super(name, age, breed, address);
        this.vocabularyLevel = vocabularyLevel;
        this.canMimic = canMimic;
        this.isTrained = isTrained;
    }
    public boolean canMimic() {
        return canMimic;
    }

    public void setCanMimic(boolean canMimic) {
        this.canMimic = canMimic;
    }

    public String getVocabularyLevel() {
        return vocabularyLevel;
    }

    public void setVocabularyLevel(String vocabularyLevel) {
        this.vocabularyLevel = vocabularyLevel;
    }
    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
    public void train() {
        if (isTrained) {
            System.out.printf("%s is trained!\n", getName());
        } else {
            System.out.printf("%s is not trained!\n", getName());
        }
    }
    public void speak(){
        if (canMimic){
            System.out.printf("%s is mimicking words with %s vocabulary level!.\n", getName(), vocabularyLevel);
        } else {
            System.out.printf("%s chirps but cannot mimic words.\n", getName());
        }
    }
}
