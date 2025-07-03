package StaticEx;

public class StaticDemo {
    // Static variable - thuộc về lớp, được chia sẻ giữa các instance
    public static int count = 0;
    
    // Non-static variable - thuộc về đối tượng cụ thể
    private String name;
    
    public StaticDemo(String name) {
        this.name = name;
        count++;  // Tăng biến static
    }
    
    // Static method - không thể truy cập biến non-static
    public static void showCount() {
        System.out.println("Số instance: " + count);
        // System.out.println(name);  // Lỗi: không thể truy cập biến non-static
    }
    
    // Non-static method - có thể truy cập cả biến static và non-static
    public void showInfo() {
        System.out.println("Name: " + name + ", Count: " + count);
    }
    
    // Static nested class - không cần instance của lớp ngoài
    public static class StaticNested {
        public void display() {
            System.out.println("Static nested class, count = " + count);
            // System.out.println(name);  // Lỗi: không thể truy cập biến non-static
        }
    }
    
    // Non-static inner class - cần instance của lớp ngoài
    public class Inner {
        public void display() {
            System.out.println("Inner class, name = " + name + ", count = " + count);
        }
    }
    
    public static void main(String[] args) {
        // Static members - truy cập trực tiếp qua tên lớp
        System.out.println("Ban đầu: " + StaticDemo.count);
        StaticDemo.showCount();
        
        // Tạo instances
        StaticDemo obj1 = new StaticDemo("Object 1");
        StaticDemo obj2 = new StaticDemo("Object 2");
        
        // Static variable được chia sẻ
        System.out.println("Sau khi tạo 2 objects: " + StaticDemo.count);  // = 2
        
        // Static nested class - khởi tạo không cần instance của lớp ngoài
        StaticNested nested = new StaticNested();
        nested.display();
        
        // Non-static inner class - cần instance của lớp ngoài để khởi tạo
        Inner inner = obj1.new Inner();
        inner.display();
    }
}