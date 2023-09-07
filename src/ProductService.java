import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductService {

    Set<Product> products = new HashSet<>();

    //METHOD TO ADD PRODUCT
    public void addProduct(Product product){
        products.add(product);
    }

    //METHOD TO GET ALL PRODUCTS
    public Set<Product> getProducts() {
        return products;
    }

    //method to access a specific product
    public Product getSpecificProduct(String name){

        //iterate through the products
        for (Product p : products)
            if (p.getName().equalsIgnoreCase(name)){
            return p;
        }
        return null;
    }

}
