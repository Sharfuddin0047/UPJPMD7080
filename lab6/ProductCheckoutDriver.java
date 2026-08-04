package lab6;

/*
2. A shopping store wants to calculate the total cost of products purchased.
Requirements:
Store the product ID, product name, price, and quantity.
Price and quantity should never be negative.
Calculate the total bill amount based on the price and quantity.
Display all product details along with the total bill.
*/
import java.util.ArrayList;

class Product {
    int productID;
    String productName;
    float price;
    int quantity;

    Product(){}

    public Product(int productID, String productName, float price, int quantity) {
        if(price<=0 || quantity <=0) {
            System.out.println("price or quantity cannot be less than or equal to zero");
            return;
        }
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public float calculateProductTotal(){
        return (float)price*quantity;
    }

    
    public void displayProductDetails() {
        System.out.println("productId: "+productID);
        System.out.println("productName: "+productName);
        System.out.println("productPrice: "+price);
        System.out.println("productQuantity: "+quantity);
        System.out.println("Total cost for "+productName+ ": "+calculateProductTotal());
    }

    
    
}
public class ProductCheckoutDriver {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Shoes", 1750, 2));
        products.add(new Product(102, "T-Shirt", 499, 3));
        products.add(new Product(103, "Jeans", 1200, 1));
        products.add(new Product(104, "Watch", 2500, 1));
        products.add(new Product(105, "Bag", 1800, 2));
        products.add(new Product(106, "Sunglasses", 999, 1));
        products.add(new Product(107, "Cap", 299, 4));

        double grandTotal = 0;
        for (Product product : products) {
            product.displayProductDetails();
            grandTotal += product.calculateProductTotal();
            System.out.println("===============================================");
        }
        System.out.println("GrandTotal of all product is: "+grandTotal);
        System.out.println("===============================================");

    }

}
