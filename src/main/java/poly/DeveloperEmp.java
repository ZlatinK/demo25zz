package poly;

public class DeveloperEmp extends Employee{
    private String[] programingLanguages;

    public String[] getProgramingLanguages() {
        return programingLanguages;
    }

    public void setProgramingLanguages(String[] programingLanguages) {
        if (!programingLanguages.equals(null)){
            this.programingLanguages = programingLanguages;
        } else {
            System.out.println("Error: Invalid array for programing languages!");
        }
    }

    public DeveloperEmp(String name, int age, String department, double salary, String startDate, String[] programingLanguages) {
        super(name, age, department, salary, startDate);
        setProgramingLanguages(programingLanguages);
    }

    @Override
    public void doWork() {
        System.out.printf("%s is writing code...\n", getName());
    }

    @Override
    public void askQuestions() {

    }

    @Override
    public void receiveFeedback() {

    }

    @Override
    public void supportSomeone() {

    }

    @Override
    public void giveFeedback() {

    }
}
