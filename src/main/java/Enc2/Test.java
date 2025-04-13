package Enc2;

public class Test {
    public static void main(String[] args){
        Person Zlatin = new Person("Zlatin", 30);
        Person Savi = new Person("Savina", 50);

        Product cigari = new Product("Cigari", 7);
        Product alcohol = new Product("Alcohol", 21);
        Product pile = new Product("Pile", 15);

        Zlatin.buyProduct(cigari);
        Zlatin.buyProduct(alcohol);
        Savi.buyProduct(cigari);
        Savi.buyProduct(alcohol);
        Savi.buyProduct(pile);

        Zlatin.printItemsInBag();
        Savi.printItemsInBag();

        Zlatin.buyProduct(pile);
        Zlatin.buyProduct(pile);

        Zlatin.printItemsInBag();

        Person Gosho = new Person("Gosho", -3);

        Gosho.buyProduct(cigari);

        Gosho.printItemsInBag();
    }
}
