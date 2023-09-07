import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ProductService service = new ProductService();
        service.addProduct(new Product("MacBook Air", "MacOs", "Kenya", 2023));
        service.addProduct(new Product("MacBook Air", "MacOS", "Kenya", 2023));
        service.addProduct(new Product("iPhone 13", "iOS", "USA", 2023));
        service.addProduct(new Product("Samsung Galaxy S22", "Android", "South Korea", 2023));
        service.addProduct(new Product("Dell XPS 13", "Windows", "USA", 2023));
        service.addProduct(new Product("Sony PlayStation 5", "Custom OS", "Japan", 2023));
        service.addProduct(new Product("HP Spectre x360", "Windows", "USA", 2023));
        service.addProduct(new Product("Google Pixel 6", "Android", "USA", 2023));
        service.addProduct(new Product("Lenovo ThinkPad X1 Carbon", "Windows", "China", 2023));
        service.addProduct(new Product("Amazon Echo Show 10", "Amazon Alexa", "USA", 2023));
        service.addProduct(new Product("Nintendo Switch Pro", "Custom OS", "Japan", 2023));

//        Set<Product> list = service.getProducts();
//        for (Product pr : list){
//            System.out.println(pr + " ");
//        }
        //iterate through the list
//        var itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next() + " ");
//        }

        System.out.println(service.getSpecificProduct("lenovo ThinkPad X1 Carbon"));
    }
}
