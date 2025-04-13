package Enc2;

public class Product {
    private String name;
    private int cost;

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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if(cost > 0){
            this.cost = cost;
        } else {
            System.out.println("Cost cannot be 0 or negative");
        }
    }

    public Product(String name, int cost){
        setName(name);
        setCost(cost);
    }
}
