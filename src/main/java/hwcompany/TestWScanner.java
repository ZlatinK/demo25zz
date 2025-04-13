package hwcompany;

import java.util.Scanner;

public class TestWScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Въведи име на фирмата: ");
        String companyName = in.nextLine();

        System.out.print("Въведи дата на създаване (напр. 15.07.2020): ");
        String startDate = in.nextLine();

        System.out.print("Въведи булстат (10 символа): ");
        String bullstat = in.nextLine();

        System.out.print("Въведи име на собственика: ");
        String ownerName = in.nextLine();

        System.out.print("Въведи първоначален капитал: ");
        double initialCapital = in.nextDouble();

        System.out.print("Въведи актуален капитал: ");
        double actualCapital = in.nextDouble();
        in.nextLine();

        soleProprietorship firm = new soleProprietorship(companyName, startDate, bullstat, ownerName, initialCapital, actualCapital);

        firm.profitStatus();

        System.out.print("Въведи име на клиент за фактура: ");
        String clientName = in.nextLine();

        System.out.print("Въведи сума за фактурата: ");
        double invoiceAmount = in.nextDouble();

        firm.issueInvoice(clientName, invoiceAmount);

        System.out.println("\n" + firm);

        in.close();
    }
}
