package access2;

import access.Product;

public class Glass extends Product {
    protected String getProtectedName() {
        return super.protectedName;
    }

    public static void main(String[] args) {
        Product product = new Product();

    }
}
