package ProductManagement.Controller;

import ProductManagement.Model.Product;
import java.util.Scanner;

public class ProductArray {
    private final Product[] products;

    public ProductArray(int n){
        products = new Product[n];
    }

    public void addProduct(){
        try (Scanner sc = new Scanner(System.in)) {
            String name;
            double price;
            int units;

            for (int i=0; i<products.length;i++){
                System.out.println("Name:");
                name=sc.nextLine();
                System.out.println("Price:");
                price= sc.nextDouble();
                System.out.println("Units:");
                units= sc.nextInt();
                sc.nextLine();

                Product p1= new Product(name,price,units);
                products [i]=p1;

  
            }
        }
    }


    public Product[] getProducts() {
        return products;
    }
}
