package access;

public class Product {
    public String publicName;
    protected String protectedName;
    String defaultName;
    private String privateName;
    //accessed from anywhere
    public void makePublicCalculation(){
        System.out.println("Public Calculation");
    }
    //only in subclass in the same package
    protected void makeProtectedCalculation(){
        System.out.println("Protection Calculation");
    }
    //only in subclass even in a different package
    void makeDefaultCalculation(){
        System.out.println("Default Calculation");
    }
    //only accessed in current class
    private void makePrivateCalculation(){
        System.out.println("Private Calculation");
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.publicName = "My Public Name";
        product.protectedName = "My Protected Name";
        product.defaultName = "My Default Name";
        product.privateName = "My Private Name";

        product.makePublicCalculation();
        product.makeProtectedCalculation();
        product.makeDefaultCalculation();
        product.makePrivateCalculation();
    }
}
