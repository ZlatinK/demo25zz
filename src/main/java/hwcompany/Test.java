package hwcompany;

public class Test {
    public static void main(String[] args) {
        soleProprietorship firm = new soleProprietorship("Дентал ЕООД", "15.07.2020", "BGN1057510", "Петър Костов", 2000, 5000);

        System.out.println("\n" + firm);

        firm.profitStatus();

        firm.issueInvoice("Мед.Факултет", 250);

    }
}
