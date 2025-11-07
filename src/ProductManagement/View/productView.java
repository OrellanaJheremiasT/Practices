package ProductManagement.View;

import ProductManagement.Controller.ProductArray;
import ProductManagement.Controller.ProductPrinter;
import java.util.Scanner;

public class productView {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int n = sc.nextInt();
        
        ProductArray productArray= new ProductArray(n);
        productArray.addProducts();
        
        ProductPrinter.print(productArray.getProducts());
    }

}
