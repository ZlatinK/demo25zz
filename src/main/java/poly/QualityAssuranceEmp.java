package poly;

public class QualityAssuranceEmp extends Employee{
    private boolean hasISTQB;

    public QualityAssuranceEmp(String name, int age, String department, double salary, String startDate, boolean hasISTQB) {
        super(name, age, department, salary, startDate);
        this.hasISTQB = hasISTQB;
    }

    @Override
    public void doWork() {
        System.out.printf("%s is writing test cases and exploring for bugs/ problems\n", getName());
    }

    public void getBonus() {
        if (hasISTQB) {
            System.out.printf("%s is getting 1000 BGN bonus\n", getName());
        } else {
            System.out.printf("%s is getting 500 BGN bonus\n", getName());
        }
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
