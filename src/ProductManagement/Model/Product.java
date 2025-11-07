package ProductManagement.Model;

public class Product {
    private int productUnits;
    private double productPrice;
    private String productName;
    
    public Product(String productName, double productPrice, int productUnits){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productUnits = productUnits;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(
                String.format("%-10S %8.2f %8d",productName,productPrice,productUnits)
        
        );
        
        return sb.toString();
    
    }

    public int getProductUnits() {
        return productUnits;
    }

    public void setProductUnits(int productUnits) {
        this.productUnits = productUnits;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }





}


