package poly;

public class Test {
    public static void main(String[] args) {
        QualityAssuranceEmp qa1 = new QualityAssuranceEmp("Ivan", 23, "QA",
                2000.50, "20.04.2025", true);
        DeveloperEmp dev1 = new DeveloperEmp("Petar", 28, "Engineering",
                2250.50, "15.03.2025", new String[]{"Java", "C#"});

        qa1.doWork();
        qa1.getPayCheck();
        qa1.getBonus();

        dev1.doWork();
        dev1.getPayCheck();
        dev1.getBonus();
    }
}
