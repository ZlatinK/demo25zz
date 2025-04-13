package Enc2;
import java.util.LinkedList;

public class Person {
    private String name;
    private int money;
    private LinkedList<Product> bagOfProducts = new LinkedList<>();

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money >= 0) {
            this.money = money;
        } else {
            System.out.println("Money cannot be negative");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public LinkedList<Product> getBagOfProducts() {
        return bagOfProducts;
    }

    public Person(String name, int money){
        setName(name);
        setMoney(money);
    }

    public void buyProduct(Product product){
        if(this.money >= product.getCost()) {
            this.bagOfProducts.add(product);
            this.setMoney(this.money - product.getCost());
            System.out.printf("%s bought %s\n", getName(), product.getName());
        } else {
            System.out.printf("%s cannot afford %s\n", this.name , product.getName());
        }
    }

    public void printItemsInBag(){
        if(bagOfProducts.isEmpty()) {
            System.out.printf("%s has no items in bag\n", this.name);
            return;
        }

        String itemNames = "";
        for (Product product : bagOfProducts){
            itemNames += product.getName() + ", ";
        }
        itemNames = itemNames.trim();
        if(itemNames.lastIndexOf(",") == itemNames.length() - 1) {
            itemNames = itemNames.substring(0, itemNames.length() - 1);
        }

        System.out.printf("%s - %s\n", this.name, itemNames);
    }

}
