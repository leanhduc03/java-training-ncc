package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 15000000, 10),
            new Product("Điện thoại", 8000000, 20),
            new Product("Tai nghe", 500000, 50),
            new Product("Máy tính bảng", 12000000, 5)
        );

        // Predicate - Lọc sản phẩm đắt (giá > 10tr)
        Predicate<Product> isExpensive = p -> p.getPrice() > 10000000;
        
        // Function - Trích xuất tên sản phẩm
        Function<Product, String> getName = Product::getName;
        
        // Consumer - In thông tin sản phẩm
        Consumer<Product> displayInfo = p -> System.out.println(
            "Sản phẩm: " + p.getName() + " - Giá: " + formatPrice(p.getPrice()) + "đ");
        
        // Supplier - Tạo sản phẩm mới
        Supplier<Product> createProduct = () -> new Product("Sản phẩm mới", 1000000, 1);
        
        System.out.println("sản phẩm đắt tiền");
        products.stream()
               .filter(isExpensive)
               .forEach(displayInfo);
        
        // Method reference
        System.out.println("\ndanh sách tên sản phẩm");
        products.stream()
               .map(getName)
               .forEach(System.out::println);
        
        // Kết hợp Predicate
        Predicate<Product> inStock = p -> p.getQuantity() > 0;
        Predicate<Product> affordable = p -> p.getPrice() < 9000000;
        
        System.out.println("\nsản phẩm hợp ví và có sẵn");
        products.stream()
               .filter(affordable.and(inStock))
               .forEach(displayInfo);
        
        // Sử dụng Supplier
        Product newProduct = createProduct.get();
        System.out.println("\nsản phẩm mới tạo");
        displayInfo.accept(newProduct);
    }
    
    // Định dạng giá tiền
    private static String formatPrice(double price) {
        return String.format("%,.0f", price);
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setPrice(double price) { this.price = price; }
}
