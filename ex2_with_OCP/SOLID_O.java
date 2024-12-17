import java.util.*;

public class SOLID_O {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL, Price.LOW);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE, Price.MEDIUM);
        Product house = new Product("House", Color.BLUE, Size.LARGE, Price.HIGH);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter pf = new ProductFilter();
        pf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("SMALL products: (new)");
        pf.filter(products, new SizeSpecification(Size.SMALL))
                .forEach(p -> System.out.println(" - " + p.name + " is small"));

        System.out.println("MEDIUM products: (new)");
        pf.filter(products, new PriceSpecification(Price.MEDIUM))
                .forEach(p -> System.out.println(" - " + p.name + " is medium price"));

        System.out.println("Blue AND Large products: (new)");
        pf.filter(products,
                new AndSpecification<Product>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.LARGE)))
                .forEach(p -> System.out.println(" - " + p.name + " is blue and large"));

        System.out.println("GREEN AND Large AND MEDUIM products: (new)");
        pf.filter(products,
                new AndSpecification<Product>(
                        new ColorSpecification(Color.GREEN),
                        new AndSpecification<Product>(
                                new SizeSpecification(Size.LARGE),
                                new PriceSpecification(Price.MEDIUM))))
                .forEach(p -> System.out.println(" - " + p.name + " is green and large and meduim"));
    }
}