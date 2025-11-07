package ProductManagement.Controller;

import ProductManagement.Model.Product;

public class ProductPrinter {
    public static void print(Product[] data){
        StringBuilder sb= new StringBuilder();
        sb.append(
                 String.format("%-10S %8S %8S", "Name","Price","Units")
        );
        System.out.println(sb.toString());
        for (Product data1 : data) {
            System.out.println(data1.toString());
        }

    }

}
