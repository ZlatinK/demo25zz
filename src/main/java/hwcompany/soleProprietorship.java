package hwcompany;

public class soleProprietorship extends Company implements invoiceIssuer{
    private String ownerName;
    private double initialCapital;
    private double actualCapital;

    public soleProprietorship(String name, String startDate, String bullstat, String ownerName, double initialCapital, double actualCapital) {
        super(name, startDate, bullstat);
        this.ownerName = ownerName;
        this.initialCapital = initialCapital;
        this.actualCapital = actualCapital;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (!ownerName.isEmpty()) {
            this.ownerName = ownerName;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        if (initialCapital >= 0) {
            this.initialCapital = initialCapital;
        } else {
            System.out.println("Initial capital cannot be 0 or negative!");
        }
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        if (actualCapital >= 0) {
            this.actualCapital = actualCapital;
        } else {
            System.out.println("Actual capital cannot be 0 or negative!");
        }
    }

    public double calculateProfit() {
        return actualCapital - initialCapital;
    }

    public void profitStatus() {
        double profit = calculateProfit();
        if (profit > 0) {
            System.out.printf("Фирмата е на печалба: %.2f лв.%n", profit);
        } else if (profit < 0) {
            System.out.printf("Фирмата е на загуба: %.2f лв.%n", profit);
        } else {
            System.out.println("Фирмата е на нула. Няма печалба или загуба.");
        }
    }

    @Override
    public void issueInvoice(String clientName, double amount) {
        System.out.println("Издадена е фактура на " + clientName + " за сума: " + amount + " лв.");
    }

    @Override
    public String toString() {
        return String.format(
                "Информация за фирмата:\n" +
                        "Име на фирмата: %s\n" +
                        "Дата на създаване: %s\n" +
                        "БУЛСТАТ: %s\n" +
                        "Собственик: %s\n" +
                        "Първоначален капитал: %.2f лв.\n" +
                        "Актуален капитал: %.2f лв.\n" +
                        "Печалба: %.2f лв.",
                getName(), getStartDate(), getBullstat(),
                ownerName, initialCapital, actualCapital, calculateProfit()
        );
    }
}
