package StringEx;

public class Spool {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        
        String s3 = new String("Hello");
        
        System.out.println("1. s1 == s2: " + (s1 == s2));  // true
        System.out.println("2. s1 == s3: " + (s1 == s3));  // false
        

        System.out.println("3. s1.equals(s3): " + s1.equals(s3));  // true
        
        String s4 = s3.intern();
        System.out.println("4. s1 == s4: " + (s1 == s4));  // true
        
        String prefix = "He";
        String s5 = prefix + "llo";  
        System.out.println("6. s1 == s5: " + (s1 == s5));  // false
        
        //Hiển thị địa chỉ bộ nhớ (hashCode)
        System.out.println("HashCode của s1: " + System.identityHashCode(s1));
        System.out.println("HashCode của s2: " + System.identityHashCode(s2));
        System.out.println("HashCode của s3: " + System.identityHashCode(s3));
        System.out.println("HashCode của s4: " + System.identityHashCode(s4));
        System.out.println("HashCode của s4: " + System.identityHashCode(s5));
    }
}