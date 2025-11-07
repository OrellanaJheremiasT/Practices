package ProductManagement.Controller;

import ProductManagement.Model.Product;

public class printProduct {
    public static void print(Product[] data){
        StringBuilder sb= new StringBuilder();
        sb.append(
                 String.format("%-10S %8S %8S", "Name","Price","Units")
        );
        System.out.println(sb.toString());
        for(int i=0;i<data.length;i++){
            System.out.println(data[i].toString());

        }

    }

}
