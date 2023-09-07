import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductService {

    List<Product> products = new ArrayList<>();

    //METHOD TO ADD PRODUCT
    public void addProduct(Product product){
        products.add(product);
    }

    //METHOD TO GET ALL PRODUCTS
    public List<Product> getProducts() {
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

    public Product getSpecificType(String type) {

        for (Product p : products)
            if (p.getType().equalsIgnoreCase(type)){
                return p;
            }
        return null;
    }

    public List<Product> getSpecificText(String txt) {
        List<Product> products1 = new ArrayList<>();
        //iterate through the list
        for (Product prods : products){
            if (prods.getName().contains(txt) || prods.getType().equalsIgnoreCase(txt) || prods.getPlace().equalsIgnoreCase(txt)){
                products1.add(prods);
            }
        }
        return products1;
    }
}
