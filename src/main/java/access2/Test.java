package access2;

import access.Product;

public class Test {
    public static void main(String[] args) {
        //creating an instance from class Product
        Product product = new Product();

        product.publicName = "Public Name";
//        product.protectedName = "Protected Name";
//        product.defaultName = "Default Name";

        product.makePublicCalculation();
//        product.makeProtectedCalculation();
//        product.makeDefaultCalculation();

        Glass wineGlass = new Glass();
        wineGlass.getProtectedName();
    }
}
